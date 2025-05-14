#!/bin/bash

# Define the source file and output assembly name
SOURCE_FILE="Solution.cs"
OUTPUT_EXE_FILE="Solution.exe"

# Compile the C# program
mcs $SOURCE_FILE

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful. Running the program..."
    mono $OUTPUT_EXE_FILE
else
    echo "Compilation failed."
fi
