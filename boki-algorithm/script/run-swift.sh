#!/bin/bash

# Define the source file and the output executable
SOURCE_FILE="Solution.swift"

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Running the program..."
    swift ./$SOURCE_FILE
else
    echo "Compilation failed."
fi
