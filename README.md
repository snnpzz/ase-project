# ase-project
## Advanced Software Engineering Project
Design a modeling language that supports the specification of data analysis pipelines over integrated web, social media and IoT (Internet of Things) sources.  
A pipeline is described as a flow or process of individual tasks applied over the data.  
The tasks can be of different types: data collection,  data integration, data cleaning, data analysis, data visualization and export of results.  
Tasks are connected by data flows that define the sequence and the exchange of information. Each data flow between tasks is characterized by format and type of data.  
* The **data collection** tasks specify input sources (file, db, rest service, etc.), its format (json, csv, …), its query endpoint and condition(s), and the input data schema (attributes and types). 
* The **data integration** tasks specify two or more inputs and fuse the data based on a value-matching approach, by specifying the attributes over which to perform “the join” and the attributes to produce in output.
* **Data cleaning** tasks define operations to be run on the data. Some predefined ones are there (e.g., remove nulls, format data, …) . Further extensions must be allowed to support custom cleaning functions.
* The **data analysis** tasks are further classified by category (description, classification, clustering, prediction).  For each category, a list of predefined analyses are available and can be chosen.When used in a pipeline, the task defines the type of analysis to be applied on the data with the needed parameters, input and output.
* **Data visualization** tasks produce graphs and diagrams out of the data. 
* **Export tasks** produce output files in various formats.

The model must also store **runtime information about the execution** of the pipeline and the respective tasks.

*Note: Add any details needed for completing the specification.*

Specify (-1, +5 points over the total exam mark):
* the abstract syntax of the language. Write appropriate OCL constraints wherever needed
* the concrete **graphical** syntax of the language
* a modeling environment (tool)
* at least two example models conforming to the language
* a model-to-text transformation that generates as output a textual report of the execution of a pipeline, printing all the information on what has been produced and when by every task.

Optional  (+2 points over the total exam mark):
* [OPTIONAL] a model-to-text transformation that generates as output the implementation of a pipeline in a programming language of choice (e.g., Python, R, …) which makes the pipeline executable.

Use the appropriate tools and make sure that the specifications are correct and working.
