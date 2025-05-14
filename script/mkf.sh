#!/bin/bash

# 경로가 제공되지 않았을 때 에러 메시지를 출력하고 종료
if [ "$#" -ne 1 ]; then
    echo "Usage: ./mkf <path>"
    echo "example: ./mkf.sh ../programmers/lv0/코딩기초트레이닝/조건문과반복문/수조작하기1"
    exit 1
fi

# 경로 저장
DIR_PATH=$1

# 해당 경로에 폴더 생성
mkdir "$DIR_PATH"

# 해당 경로에 파일 생성
touch "$DIR_PATH/Solution.cpp"
touch "$DIR_PATH/Solution.cs"
touch "$DIR_PATH/Solution.go"
touch "$DIR_PATH/Solution.java"
touch "$DIR_PATH/Solution.js"
touch "$DIR_PATH/Solution.kt"
touch "$DIR_PATH/Solution.py"
touch "$DIR_PATH/Solution.swift"
touch "$DIR_PATH/Problem.md"

echo "Files created at $DIR_PATH"
