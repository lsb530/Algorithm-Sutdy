import csv

file = open("Books.csv", "a")
title = input("Enter book title: ")
author = input("Enter book author: ")
year = input("Enter book published year: ")
file.write(f"{title},{author},{year}\n")
file.close()

file = open("Books.csv", "r")
print(file.read())
