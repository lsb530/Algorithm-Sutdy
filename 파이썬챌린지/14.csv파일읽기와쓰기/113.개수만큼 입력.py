import csv

num = int(input("How many books do you want to add to the list?: "))
file = open("Books.csv", "a")
for x in range(num):
    title = input("Enter book title: ")
    author = input("Enter book author: ")
    year = input("Enter book published year: ")
    file.write(f"{title},{author},{year}\n")
file.close()

search = input("Enter an authors name to search for: ")
file = open("Books.csv", "r")
exist = False
for row in file:
    if search in row:
        print(row, end='')
        exist = True
if not exist:
    print("There are no books by that author in this list.")
file.close()
