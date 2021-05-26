import csv

file = list(csv.reader(open("Books.csv")))
for i in file:
    print(i)
print()
select = int(input("Which row do you want to delete?: "))
del file[select]
for i in file:
    print(i)
print()
select = int(input("Which row do you want to update?: "))
title = input("Enter book title: ")
author = input("Enter book author: ")
year = input("Enter book published year: ")
file[select] = [title, author, year]
newOne = open("Books.csv", "w")
newOne.write(str(file))
# print(file)
