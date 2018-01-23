
# This script will generate an executable version of the pipeline

# Structure of the program:
# - if sources are local files and path is not specified, place them in a folder named "sourceDFs" at the same level of the R file;
#	if sources are remote, if they don't require credentials they will be automatically downloaded, otherwise you need to manually
#	download them;
# - all output files will be placed in a folder named "output" at the same level of the R file.

# A pdf file containing plots will be exported to "output/airQuality.pdf"
# A txt file containing summaries will be exported to "output/airQuality_summary.txt"
 
# Import libraries (if some are missing, install them: install.packages("library_name") )

# install.packages("readr")
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
pdf("output/airQuality.pdf")


## COLLECTION TASK
# Import sourceDFs as dataframes
# Loading file humidityTemp.csv

# TODO: check the separator character for the csv file
separatorChar <- ','
humidityTemp.csv <- read.csv("sources/humidityTemp.csv", sep = separatorChar)


# Loading file pressure.txt

pressure.txt <- read.table("sources/pressure.txt", header = T)
# TODO
# The sourceDF 'pressure.txt' is a TXT file, every row could have been imported as a unique column, 
# check if you need to manually split it in the desired columns		


# Loading file pollution.csv

# TODO: check the separator character for the csv file
separatorChar <- ','
pollution.csv <- read.csv("sources/pollution.csv", sep = separatorChar)




## INTEGRATION TASK
# Join all data in a unique data frame

sourceDF <-
	merge(
	merge(
		humidityTemp.csv, 
		pollution.csv, 
		by.x = 'timestamp', by.y = 'timestamp')
		, pressure.txt, 
		by.x = 'timestamp', by.y = 'timestamp')



#install.packages("anytime")
library(anytime)

attach(sourceDF)

## CLEANING TASK
# TODO: User defined cleaning operation
# formatDate: ConvertTimestampinDateAndHour
sourceDF$date <- anydate(sourceDF$timestamp)
sourceDF$time <- strftime(anytime(sourceDF$timestamp), format = "%H:%M:%S")

sourceDF$timestamp <- NULL

# Predefined operation :  remove column
	sourceDF$pm1 <- NULL


# Predefined operation :  remove null values
	sourceDF <- na.omit(sourceDF)


## ANALYSIS TASK

# Clustering analysis:  kMeans
	kMeans <- kmeans(sourceDF[ , sapply(sourceDF, is.numeric)], 4)
	plot(sourceDF[ , sapply(sourceDF, is.numeric)], col = kMeans$cluster)
	sourceDF$PMgroup <- kMeans$cluster

# Classification analysis:  KNN
	knnInd <- sample(nrow(sourceDF), round(nrow(sourceDF) * 0.8))
	train  <- cbind(		temperature[knnInd]
			, humidity[knnInd]
	)
	knnInd <- -knnInd
	test   <- cbind(		temperature[knnInd]
			, humidity[knnInd]
	)
	# TODO: change k_KNN if you need a different k
	k_KNN <- 3 
	cl <- gl(3, 24, labels = c("Yes", "No", "Soso"))
	KNN_goodDay <- knn(train, test, cl, k = k_KNN, prob = TRUE)
	sourceDF$goodDay <- KNN_goodDay
	rm(knnInd, train, test)

# Predictive analysis:  multiple linear regression
	regrTemp <- lm(		temperature ~ 
			pm25
			 + pm10
	, data = sourceDF)
	summary(regrTemp)
	out <- capture.output(summary(regrTemp))
	cat("\nMultiple linear regression", out, file="output/airQuality_summary.txt", sep="\n", append=TRUE)

# Predictive analysis:  multiple linear regression
	regrHum <- lm(		humidity ~ 
			pm25
			 + pm10
	, data = sourceDF)
	summary(regrHum)
	out <- capture.output(summary(regrHum))
	cat("\nMultiple linear regression", out, file="output/airQuality_summary.txt", sep="\n", append=TRUE)



## EXPORT TASK
	write.csv(sourceDF, file = "output/airQuality.csv", row.names = F)


dev.off()

rm(list = ls())
