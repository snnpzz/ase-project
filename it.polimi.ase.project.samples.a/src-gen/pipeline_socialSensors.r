
# This will generate an executable version of the pipeline
# Structure of the program:
# - if sources are local files, place them in a folder named "sources" at the same level of the R file;
# - all output files will be placed in a folder named "output" at the same level of the R file.

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

# Collection task: import sources as dataframes

# Load file social.csv
source1 <- read.csv("sources/social.csv")
# Load file web.json
source2 <- read.json("sources/web.json")



# Integration: join all data in a unique one

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


# Cleaning: do specified cleaning operation

# Predefined operation :  remove column

# Predefined operation :  remove column

# Predefined operation :  remove null values
	source <- na.omit(source)


# Analysis


# Visualization


# Export



# dev.off()

rm(list = ls())
