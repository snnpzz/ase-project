
# This will generate an executable version of the pipeline
# Structure of the program:
# - if sources are local files, place them in a folder named "sources" at the same level of the R file;
# - all output files will be placed in a folder named "output" at the same level of the R file.

# A pdf file will be anyway exported in "output/socialSensors.pdf"

# Import libraries
# (If some libraries are missing, install them: install.packages("library_name") )
library(readr)

# install.packages("reshape")
library(reshape)

library(MASS)
library(class)
library(e1071)
library(randomForest)

# install.packages(ggplot2)
library(ggplot2)

set.seed(501)
pdf("output/socialSensors.pdf")

## COLLECTION TASK
# Import sources as dataframes

# Loading file social.csv
source1 <- read.table("sources/social.csv")
# Loading file web.json
source2 <- read.table("sources/web.json")



## INTEGRATION TASK
# Join all data in a unique one

sourceList <- list(
			source1
			, source2
)
joinAttributes <- c(
			"date"
			, "date"
)
joinAttributes <- unique(joinAttributes)
source <- merge_all(sourceList, by = joinAttributes)	


## CLEANING TASK

# Predefined operation :  remove column
	source$source <- NULL

# Predefined operation :  remove column
	source$siteName <- NULL

# Predefined operation :  remove null values
	source <- na.omit(source)


## ANALYSIS TASK

# Clustering analysis
			# Kmeans
			kMeansCount <- kmeans(source, 2)
			plot(source, col = kMeansCount$cluster)
			source$countkM <- kMeansCount$cluster
		


## EXPORT TASK
	write.table(source, file = "output/analysis.csv")


dev.off()

rm(list = ls())
