
# This script will generate an executable version of the pipeline

# Structure of the program:
# - if sources are local files and path is not specified, place them in a folder named "sourceDFs" at the same level of the R file;
#	if sources are remote, if they don't require credentials they will be automatically downloaded, otherwise you need to manually
#	download them;
# - all output files will be placed in a folder named "output" at the same level of the R file.

# A pdf file containing plots will be exported to "output/socialAnalysis.pdf"
# A txt file containing summaries will be exported to "output/socialAnalysis_summary.txt"
 
# Import libraries (if some are missing, install them: install.packages("library_name") )

library(readr)

# install.packages("plyr")
# install.packages("XML")
# install.packages("jsonlite")
# install.packages("rjson")
library(plyr)
library(XML)
library(jsonlite)
library(rjson)

# install.packages("e1071")
# install.packages("randomForest")
library(MASS)
library(class)
library(e1071)
library(randomForest)

# install.packages(ggplot2)
library(ggplot2)

# install.packages("dplyr")
# install.packages("scales")
# install.packages("reshape2")
# install.packages("tibble")
library(dplyr)
library(scales)
library(reshape2)
library(tibble)

set.seed(501)
pdf("output/socialAnalysis.pdf")


## COLLECTION TASK
# Import sourceDFs as dataframes
# Loading file posts.csv

# TODO: check the separator character for the csv file
separatorChar <- ';'
posts.csv <- read.csv("sources/posts.csv", sep = separatorChar)




sourceDF <- posts.csv


## CLEANING TASK

# Predefined operation :  remove column
	sourceDF$source <- NULL

# TODO: User defined cleaning operation
# orderByDate: OrderByAsc

# TODO: User defined cleaning operation
# group: GroupByDate


## ANALYSIS TASK

# Descriptive analysis:  view data
View(sourceDF)
sourceDF

# Descriptive analysis: 	
	data2plot <- data.frame(	
		
		numbPosts = sourceDF$numbPosts
		 , 
		date = sourceDF$date
		 , 
		numbUsers = sourceDF$numbUsers
		, row.names = NULL)
		
		ggplot(data2plot, aes(x = numbPosts, fill = date)) + geom_histogram()
	

# Clustering analysis:  kMeans
	kMeansUsers <- kmeans(sourceDF[ , sapply(sourceDF, is.numeric)], 5)
	plot(sourceDF, col = kMeansUsers$cluster)
	sourceDF$group <- kMeansUsers$cluster

# Predictive analysis:  simple regression
	linRegrHour <- lm(mostActiveHour ~ numbUsers, data = sourceDF)
	summary(linRegrHour)
	out <- capture.output(summary(linRegrHour))
	cat("\nLinear regression", out, file="output/socialAnalysis_summary.txt", sep="\n", append=TRUE)

# Predictive analysis:  multiple linear regression
	multRegrHour <- lm(		mostActiveHour ~ 
			numbUsers
			 + numbPosts
	, data = sourceDF)
	summary(multRegrHour)
	out <- capture.output(summary(multRegrHour))
	cat("\nMultiple linear regression", out, file="output/socialAnalysis_summary.txt", sep="\n", append=TRUE)



## EXPORT TASK
	write.table(sourceDF, file = "output/analyzesPosts.csv")


dev.off()

rm(list = ls())
