
# This script will generate an executable version of the pipeline

# Structure of the program:
# - if sources are local files and path is not specified, place them in a folder named "sources" at the same level of the R file;
#	if sources are remote, if they don't require credentials they will be automatically downloaded, otherwise you need to manually
#	download them;
# - all output files will be placed in a folder named "output" at the same level of the R file.

# A pdf file will be exported in "output/socialAnalysis.pdf"

# Import libraries (if some are missing, install them: install.packages("library_name") )

library(readr)

# install.packages("plyr")
# install.packages("XML")
# install.packages("jsonlite")
library(plyr)
library(xml)
library(jsonlite)


library(MASS)
library(class)
library(e1071)
library(randomForest)

# install.packages(ggplot2)
library(ggplot2)



set.seed(501)
pdf("output/socialAnalysis.pdf")


## COLLECTION TASK
# Import sources as dataframes

# Loading file posts.csv

posts.csv <- read.table("sources/posts.csv")






## CLEANING TASK

# Predefined operation :  remove column
	source$source <- NULL

# TODO: User defined cleaning operation
# orderByDate: OrderByAsc

# TODO: User defined cleaning operation
# group: GroupByDate



## ANALYSIS TASK

# Descriptive analysis:  view data
View(source)
source

# Descriptive analysis: 	
	data2plot <- data.frame(	
		numbPosts, 
		date, 
		numbUsers, 
		row.names = FALSE)
		
		hist(data2plot)
	

# Clustering analysis:  kMeans
	kMeansUsers <- kmeans(source, 5)
	plot(source, col = kMeansUsers$cluster)
	source$group <- kMeansUsers$cluster

# Predictive analysis:  simple regression
	linRegrHour <- lm(mostActiveHour ~ numbUsers, data = source)
	summary(linRegrHour)

# Predictive analysis:  multiple linear regression
	multRegrHour <- lm(		mostActiveHour ~ 
			numbUsers
			 + numbPosts
	, data = source)
	summary(multRegrHour)



## EXPORT TASK
	write.table(source, file = "output/analyzesPosts.csv")


dev.off()

rm(list = ls())
