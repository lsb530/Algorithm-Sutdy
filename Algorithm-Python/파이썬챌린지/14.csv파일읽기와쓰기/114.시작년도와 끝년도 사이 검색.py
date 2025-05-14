import csv

# file = open("Books.csv", "r")
startYear = int(input("Enter publication started Year: "))
endYear = int(input("Enter publication ended Year: "))
file = list(csv.reader(open("Books.csv")))
tmp = []
for row in file:
    tmp.append(row)

for row in tmp:
    if startYear <= int(row[2]) <= endYear:
        print(row)
