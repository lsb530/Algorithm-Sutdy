#!/bin/bash

# Define the source file and the output executable
SOURCE_FILE="Solution.cpp"
OUTPUT_EXECUTABLE="Solution-cpp"

# Compile the C++ program
g++ -o $OUTPUT_EXECUTABLE $SOURCE_FILE

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful. Running the program..."
    ./$OUTPUT_EXECUTABLE
else
    echo "Compilation failed."
fi
