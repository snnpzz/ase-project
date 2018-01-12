# Advanced Software Engineering
Academic Year 2017/2018    
## Project documentation  
* **Bafaro Eva 893961**  
* **Pozzoli Susanna 897788**  
  
Using _Eclipse_, we defined the abstract syntax of our language, then we designed a concrete graphical syntax and created a modelling environment with _Sirius_, we defined 2 sample models, and finally we created a model to text transformation with _Acceleo_ which creates a textual report of the pipeline in _HTML_.


# Abstract Syntax

The metamodel is defined by a _.ecore_ file and some constraints (validation rules).

![](https://github.com/SPozzoli/ase-project/blob/master/Pictures/pipeline.png)


## Ecore

The container of our model is the _EClass_ **Pipeline**, which is an aggregation of the following _EClasses_:
* **Task**: the abstract class representing the various tasks, it has a name as identifier, it specializes into the concrete EClasses **CollectionTask**, **IntegrationTask**, **CleaningTask**, **AnalysisTask**, **VisualizationTask** and **ExportTask**;
* **DataFlow**: this class represents the flow of data through the various tasks;
* **Source**: this class represents the sources of the data, and is binary associated with the CollectionTask;
* **File**: this class represents the generated output, and is binary associated with the ExportTask;
* **InternalDataFlow**: it’s used to link operations inside the various tasks, to define their order.

### Data flow, Schemas and Attributes
Dataflow represents the flow of data between tasks. It has a format (_CSV_, _JSON_, _TXT_ or _XML_), and is composed by a **Schema**. The latter is composed by **Attributes**, which can be **SimpleAttributes** or **ComplexAttribute**. The latter are composed by attributes, while the first just have a _name_ and a _type_ (_mString_, _mInteger_, _mDouble_, _mBoolean_ or _mDate_). Within the same schema (or the same complex attribute) attributes can't have the same name, not even if they are of different type.
Attributes are ordered via the _next/previous_ association.

### Tasks and Operations

Each task is composed by it's operations. For almost each operation we defined an _EEnumeration_ to define its type.

* **CollectionTask**: for each **Source**, there's an **ImportOperation** linked to it and to its schema. The tasks has many outgoing dataflows as many sources.
  * Sources have the attributes: _name_, _path_, _format_, and to grant remote sources _serveName_, _serverPort_, _userName_ and _password_. If the source is local, only the first three parameters are set.
* **IntegrationTask**: if there are many sources, for each couple an **IntegrationOperation** is needed to join data in a unique dataflow (if the source is only one this task is not needed). Every operation needs at least 2 attributes (one for each source), and can produce an output attribute.
* **CleaningTask**: it's composed by the abstract class **CleaningOperation**, which specializes in **UserDefinedCleaningOperation** and **PredefinedCleaningOperation**. Both have an ID and are associated with one or more attributes, and the latter has the attribute _type_ which is an enumeration: _removeNulls_, _removeNegative_, _round_, _removeColumn_ and _removeDuplicates_. This task isn't mandatory, but in the case there must be at least one cleaning operation.
* **AnalysisTask**: it's composed by the abstract class **AnalysisOperation**, which has an ID, one or more input attributes and possibly an output attribute. There must be at least one analysis in the pipeline. We have 4 type of analyzes:
  * **DescriptiveAnalysisOperation**, which requires input attributes but don't generate any output, they show the data as a table or in some type of plots;
  * **ClassificationAnalysisOperation**, just _KNN_ generate an output attributes, the others (_LogisticRegression_, _LDA_, _QDA_ and _SVM_) don't because they build a model;
  * **ClusteringAnalysisOperation**, these operations requires an integer K (the number of clusters) besides the input attributes; only _kmeans_ generates an attribute, _hierarchical clustering_ doesn't;
  * **PredictiveAnalysisOperation**, they don't generate any attribute as they build models, they are _Linear regression_, _Multiple linear regression_ and _Random forests_; for the regression we have he condition that the input attribute must be a number (integer or float). 
* **VisualizationTask**: it's composed by the **VisualizationOperation**s, which have an ID and are associated with a **Chart** each. Charts are then associated with attributes which will be their axis. This task is not mandatory.
* **ExportTask**: for each generated **File**, there's an **ExportOperation** linked to it.
  * Each File has a _name_, _path_ and _format_ (we suppose to export files only locally).

For the Cleaning and Analysis task, and order between operation is required, so we have the _internal data flow_.

### Tasks and Data flows

Task is linked to DataFlow by two binary associations, so from the point of view of:
* task, we can get the _incoming_ and _outgoing_ dataflow;
* dataflow, we can get the _source_ and _target_ task.
Operations are linked by the InternalDataFlow as tasks are linked by the DataFlow.


## Validation

To complete our model, we made some other assumptions, which are represented by constraints we added to the model.  
  
The tasks are unique and executed in the order we defined them: `  Collection -> Integration -> Cleaning -> Analysis -> Visualization -> Export  `  

This assumption is expressed by these type of constraints:  
``` 
 context Pipeline {
	constraint uniqueTasks {
		check: self.tasks -> select(t|t.isTypeOf(CollectionTask)) -> size() <= 1 and 
			self.tasks -> select(t|t.isTypeOf(IntegrationTask)) -> size() <= 1 and
			self.tasks -> select(t|t.isTypeOf(CleaningTask)) -> size() <= 1 and
			self.tasks -> select(t|t.isTypeOf(AnalysisTask)) -> size() <= 1 and
			self.tasks -> select(t|t.isTypeOf(VisualizationTask)) -> size() <= 1 and
			self.tasks -> select(t|t.isTypeOf(ExportTask)) -> size() <= 1
		message: 'There can be at most 1 task per type'
	}
 }
```
``` 
 context CollectionTask {  
     constraint initialTask {  
         check: self.incoming -> size() == 0  
         message: "Collection task can't have an incoming data flow"  
     }  
     constraint nextTypeCollection {  
         check: (self.outgoing -> size() == 1) and (self.outgoing.target -> select(t |t.isTypeOf(CollectionTask)
	        or t.isTypeOf(VisualizationTask) or t.isTypeOf(ExportTask)) -> size() == 0) or 
		(self.outgoing -> size() > 1)
         message: "Collection task must be linked to integration, cleaning or analysis task"  
     }  
 }
```  

Furthermore, not all of them must be present, the mandatory ones are Collection, Analysis and Export: if the source is unique, there is no need for Integration; the data can be already cleaned (no need for Cleaning); a user may not want to see the results of analysis (no need for Visualization).  
  
All tasks except Collection and Export, must have a unique outgoing dataflow, and all tasks except Integration and Collection must have a unique incoming dataflow. From Collection to Integration task there can be multiple data flows, precisely as many as the sources are.  
```
 context CollectionTask {
	constraint manyDataFlowsFromCollectionAsManyImports {
		check: self.importOperations -> size() == (self.outgoing -> size())
		message:  "In collection task there must be as many outgoing data flows as many input sources"
	}
	constraint allOutgoingDataFlowsTargetingSameIntegrationTask {
		check: (self.outgoing -> size() > 1) implies (self.outgoing.target -> 
			forAll(t | t.isTypeOf(IntegrationTask)))
		message: "If there are many outgoing data flows from the collection task, all of them must be 
			linked to the same integration task"
	}
 }
```  
  
Also the internal dataflow between operations must be unique (and obviously a cleaning operation can be linked only to another cleaning operation, and an analysis operation can be linked only to another analysis operation, so the internal data flow can't exit the task).  
```
context Pipeline {
	constraint dataFlowBetweenCleaningOperation {
		check: self.tasks -> collect(t:CleaningTask | t.cleaningOperations -> size()) -> sum() <= 
			(self.internalDataFlows -> select(d | d.source.isKindOf(CleaningOperation) and 
			d.target.isKindOf(CleaningOperation)) -> size() + 1) or 
			collect(t:CleaningTask | t.cleaningOperations -> size()) -> sum() == 0
		message: "Missing one or more data flows between cleaning operations"
	}
}
```  
  
Within Cleaning and Analysis Task, operation must be all executed once (they all have one incoming and one outgoing internal data flow, except for the first and the last, and there must not be cycles). This is expressed by the cardinality of the relation between operations and internal dataflow, and the following constraints:
```
context CleaningTask {
	constraint uniqueInternalDataFlowOut {
		check: self.CleaningOperations -> forAll(o | o.outgoing -> size() <= 1)
		message: "Cleaning operations can have at maximum one outgoing internal data flow"
	}
	constraint uniqueInternalDataFlowIn {
		check: self.cleaningOperations -> forAll(o | o.incoming -> size() <= 1)
		message: "Cleaning operations can have at maximum one incoming internal data flow"
	}
	constraint initialCleaningOperation {
		check: self.cleaningOperations -> select(op | op.incoming == null) -> size() == 1
		message: "There can be just one initial cleaning operation. Some internal data flows are wrong"
	}
	constraint finalCleaningOperation {
		check: self.cleaningOperations -> select(op | op.outgoing == null) -> size() == 1
		message: "There can be just one final cleaning operation. Some internal data flows are wrong"
	}
}
```  
  
Source can be imported only once, as files can be exported only once (and obviously each import[export] operation is associated with a unique source[file]).  
```
 context Pipeline {
	constraint sourceImportedOnce {
		check: self.sources -> forAll(s | (self.tasks -> select(t | 
			t.isTypeOf(CollectionTask)).importOperations -> 
			forAll(i | i.read == s)) -> size() == 1)
		message: "Imports must be linked to different input sources"
 	}
 }
```  
  
Each schema must have at least one attribute, and all attributes within the same schema must have different names.
```
 context Schema {
	constraint SchemaHasAttributes {
		check: self.attributes -> size() > 0
		message: "Each schema must have at least one attribute"
	}
	constraint uniqueNameAttribute {
		check: self.attributes -> forAll (a1 | self.attributes -> forAll (a2 | a1 <> a2 implies 
			a1.name <> a2.name))
		message: "There can't be more attributes with the same name in the same schema"
	}	
}
```  
  
As we already said, if there are many source the Integration Task is needed, and the number of _integrationOperation_ is the number of sources - 1 (they are merged one pair at a time). Obviously the attributes on which we join must be of the same type.  
```
 context Pipeline {
	constraint ifManySourcesIntegration {
		check: self.sources -> size() > 1 implies self.tasks -> select(t | t.isTypeOf(IntegrationTask))
			-> size() == 1
		message: "If there are many input sources there must be a integration task"
	}
	constraint numberOfIntegrationOperation {
		check: self.sources -> size() > 1 implies self.sources -> size() ==
			self.tasks -> select(t | t.isTypeOf(IntegrationTask)).integrationOperations -> 
				first() -> size() + 1
		message: "The number of integration operation must be the number of sources - 1"
	}
 }
```    
  
Since the Analysis Task can produce other attributes, the incoming and outgoing dataflows must have compatible schemas, which means that all the incoming schema attributes must be present in the outgoing schema attributes, and the output schema must include all the attributes generated by the analysis operations:  
```
 context AnalysisTask {
	constraint outputSchemaIsCompatibleWithInputSchema {
		check: self.incoming.schema.attributes -> first() -> forAll(attr1 | self.outgoing.schema.attributes
			-> first() -> exists(attr2 | attr1.name == attr2.name and attr1.type == attr2.type))
		message: "The outgoing data flow schema must contain all the attributes of the incoming data flow schema"
	}
	constraint outgoingDataFlowHasRightSchema {
		check: self.analysisOperations.outputAttribute -> select(attr | attr <> null) -> size() > 0 
			implies self.analysisOperations.outputAttribute -> select(attr | attr <> null) -> 
			forAll(attr1 | self.outgoing.schema.attributes -> first() -> exists(attr2 | attr1.name == 
			attr2.name and attr1.type == attr2.type))
		message: "The outgoing dataflow schema must contain all the generated output attributes" 
	}
 }
```  
  
For clarity and implementation reasons, analysis and cleaning operations must all have different IDs, and there is a series of constraints regarding the specific analysis operations (number and type of input and output attributes), which we have mentioned introducing them.




# Graphical Concrete Syntax

## Eclipse Sirius

We created a modeling workbench with _Eclipse Sirius_. This diagram editor allows users to visualize and edit a pipeline with its elements and their relationships.  
A _Viewpoint Specification Project_ contains the definition of our modeling workbench. The Viewpoint Specification Project creation wizard creates a new project containing a _.odesign_ file. This file describes the modeling workbench that we created. It will be interpreted by the Sirius runtime. In this file the wizard has created a first viewpoint we renamed to `pipeline`. This viewpoint provides a diagram that the user will be able to instantiate. We configure this diagram to graphically represent instances of _Pipelines_. A _Diagram_ shows _Nodes_, _Containers_, _Element Base Edges_ and _Relation Based Edges_ which are elements of the model.  
To define the way a diagram element is graphically represented on the diagram, it must declare a _Style_. The _Style_ defines the graphical attributes of the _Diagram Element_ (e.g. its color).  
_Sources_, _Charts_ and _Files_ are displayed as nodes.  
A _Container_ is a kind of diagram element that can contain other diagram elements.  
On the _Pipeline diagram_, we used seven containers to represent:
* Schema
* CollectionTask
* IntegrationTask
* CleaningTask
* AnalysisTask
* VisualizationTask
* ExportTask

Now, to display children inside these containers, we added _Sub Nodes_ and _Bordered Nodes_.  
Here, we have chosen a workspace image to represent an Operation.   
The following aggregations and associations of the Domain Model are represented by _Relation Based Edges_:
* attributes
* axes
* chart
* inputAttribute
* inputAttributes
* next
* outputAttribute
* outputAttributes
* read
* use
* write

To display instances of _DataFlow_ and _InternalDataFlow_, we created two _Element Based Edges_.  
### Palette
We completed this desinger with a palette containing tools to allow users to create new model elements.  
We added five _Sections_ named _Tools_, _Data Flows_, _Schema_, _Tasks_ and _Operations_ to the _Layer_.  
The palette is composed of tools which will allow the user to create new objects.  
To create new instances of Domain Classes, we added a _Node Creation_ element to the _Section_ _Tools_. To define which kind of nodes will be created by the tool, the _Node Creation_ element must be associated to an existing node (e.g. _SourceNode_). When the user will use the tool, actions will be executed. We had to define them. The first step consisted in adding a _Change Contex_ element to define the context of the actions. The _Change Contex_ element contains an expression which allows Sirius to find the model element which will be the context. Then, we added a _Create Instance_ which will create a new instance of _Source_. We specified the type of the new instance and how it will be attached to the context.  
We copied, pasted and adapted this tool to provide a _Node Creation_ tool for all the elements.  
An _Edge Creation_ tool allows the user to create relationships directly from the diagram, by using the palette. We used this tool to allow the user to set the relations of an element. We created a _Edge Creation_ tool to set the _next_ of an _Attribute_. Then we defined the operations that will be performed by this tool each time the user will click on it. Under the _Begin_ object, we created a _Change Context_. We set its _Browse Expression_ to `var:source` in order to define the execution context of the next operations. Under the _Change Context_ we created a _Set_. It will set the _next_ of the first Attribute clicked (source) to the second Attribute clicked (target):
* **Feature Name:** `next`
* **Value Expression:** `var:target`

For the element based case, it is slightly different as we have to create the element and store it in the model and then we need to set the references between this element and its "source" and "target".  
We proceeded the same way to create a _Edge Creation_ tool for all the relationships.  
A _Reconnect Edge_ tool allows the user to change the end of a relationship by moving it directly from the diagram. We created a _Reconnect Edge_ tool to change the _next_ of an Attribute. We associated an edge to each reconnect tool. Then we created a _Change Context_ and set its expression to `var:element` (the attribute that will change its next). Finally, we created a _Set_ to assign the new selected attribute (`var:target`) as _next_ of this attribute.  
We copied, pasted and updated this tool to create a _Reconnect Edge_ tool for all the relationships.  

# Samples

Here are some example models conforming to the metamodel.

## Sample A

The first example is a simple in case in which we have a unique source, representing some social media data, on which we want to perform some statistical analyzes.

The source _posts.csv_ is a simple _csv_ file, with the following columns: 
* _date_: date on which the data were collected;
* _source_: the social media which data are referred to (Facebook, Instagram, Twitter, ...);
* _numbPosts_: the number of posts/photos posted that day;
* _numbUsers_: the number of users that posted something that day;
* _mostActiveHour_: the hour in which the number of users was maximum for that day;
* _holiday_: if that day was a holiday or a day off.

Data are collected in the first task (_Collection task_) through an _import operation_, which uses the _schema_ described above.
The _import operation_ is linked to its _source_ by a dotted arrow, and to its _schema_ by a dashed arrow.

A _dataflow_ is connected to its _schema_ by a dotted line.

Then some _cleaning operation_ in the _Cleaning task_ are done:
* a _user defined_ operation, in which data are ordered by date;
* a _predefined_ operation, precisely _removeColumn_, removing the _source_ column;
* another _user defined_ operation, in which data are aggregated by date (number of posts and number of users are added, and as mostActiveHour we will consider the maximum).

The order is defined by the _internal dataflow_.  
_Cleaning operation_ that requires input attributes are linked to them by dashed arrows.  
(Since _user defined_ operation are defined by a simple short description by the user, in the  implementation of the pipeline the user will have to complete these operations.)  

The _dataflow_ from _Cleaning task_ to _Analysis Task_ has a new _schema_, which is like the initial one, except for the _source_ attribute which was removed.
Now analysis operations are performed (again the order is defined by the _internal dataflow_):
* _ViewData_: the user will simply view a table representing all data (no input attributes are required);
* _Histogram_: by specifying the input attributes, an histogram representing there attributes will be built;
* _kMeans_: observation will be grouped into k (in this case we specify k = 5) clusters, and a new attribute _group_ is added to the schema;
* _LinearRegression_: a simple linear model predicting the _mostActiveHour_ on _numbUsers_;
* _MultipleLinearRegression_: a linear model predicting the _mostActiveHour_ on _numbUsers_ and _numbPosts_.
Again _analysis operations_ are linked to their input/output attributes (if present) by dashed arrows.  

The final _dataflow_, from _Analysis Task_ to _Export task_, has again another schema, which is the previous one plus the attribute _group_.  

In the final task (_Export task_), just one file is exported through an _export operation_, and the file _analyzesPosts.csv_ is generated. The _export operation_ is linked to its _file_ by a dotted line.  

Here is a representation of the model:

![Sample A](https://github.com/SPozzoli/ase-project/blob/master/Pictures/ADiagram.jpg)


## Sample B

Now a little more complex example. We have some sensors that measure air quality: one for temperature and humidity, one for pressure and another for pollution. Each sensor writes data in a different file, the first and the latter in _csv_ format, the other in _txt_.

The _schemas_ are:
* temperature and humidity:
  * _timestamp_: an integer that represents date and time in the _epoch_ format;
  * _temperature_: a double value that represents the temperature;
  * _humidity_: an integer that represents the percentage of humidity;
* pressure:
  * every row will be a string in the format: _"timestamp_value"_;
* pollution:
  * _timestamp_;
  * _pm1_: integer representing the pm1 particles value;
  * _pm25_: integer representing the pm2.5 particles value;
  * _pm10_: integer representing the pm10 particles value.

Since we have three sources, we have an _Integration task_, and we have 3 dataflows between _Cleaning_ and _Integration_ tasks.  
In the _Integration Task_, we have 2 _integration operations_, which join couple by couple the sources in a unique one.  
(Since one source is a txt format, in the implementation part the user will have to complete the join part, after splitting the file in the right columns.)  

After the integration, the schema has the following attributes: _timestamp_, _temperature_, _humidity_, _pressure_, _pm1_, _pm25_ and _pm10_.  

In the _Cleaning task_ we have the following _cleaning operations_:
* a _user defined_ operation will format _timestamp_ into _date_ and _hour_;
* _removeColumn_ _pm1_;
* _removeNulls_ on the whole table.

Since one column was splitted in two other columns, and another was removed, the outgoing dataflow from _cleaning task_ has a new _schema_.  

Then we do the following _analysis operations_ in the _Analysis Task_:
* _kMeans_ with k = 4;
* _KNN_ (K Nearest Neighbour, the default k is 3, in the implementation part it can be changed) to classify data according to _temperature_ and _humidity_;
* _MultipleLinearRegression_ to estimate _temperature_ from _pm_ values;
* _MultipleLinearRegression_ to estimate _humidity_ from _pm_ values.

Finally in the _Export task_ we export the final schema in a new _csv_ file, named _airQuality.csv_. 

Here is the diagram (arrows and links have different colours for clarity):

![Sample B](https://github.com/SPozzoli/ase-project/blob/master/Pictures/BDiagram.jpg)

# Model to Text Transformation
## Report HTML
### it.polimi.ase.project.pipeline2html
#### reportHtmlFile.mtl
The `generateHtml()` template uses the "file block" to generate _.html_ files.  
[Bootstrap](http://getbootstrap.com/) requires the use of the HTML5 doctype. To ensure proper rendering and touch zooming for all devices, we added the responsive viewport metatag to our `<head>`.  
We defined three divisions in the HTML document.  
The first `<div>` contains information about the pipeline.    
The second `<div>` tag is used to group block-elements containing information on the tasks inside the pipeline. For each task, the user is provided with information on it, including incoming data flow(s) or source(s), operations and outgoing data flow(s) or file(s).  
The third `<div>` tag is used to group block-elements containing information on the operations inside the tasks of the pipeline. For each operation, the user is provided with information on it, including incoming internal data flow(s) or source(s), input attribute(s), output attribute(s) and outgoing internal data flow(s) or file(s).    
#### mainModule.mtl
### it.polimi.ase.project.pipeline2html.ui
