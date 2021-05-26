import csv

# file = open("Books.csv", "r")
startYear = int(input("Enter publication started Year: "))
endYear = int(input("Enter publication ended Year: "))
# data = []
# for row in file:
#     splitData = row.split(',')
#     data.append(int(splitData[2].strip('\n')))
# file.close()
# file = open("Books.csv", "r")
# i = 0
# for row in file:
#     if startYear <= data[i] <= endYear:
#         print(row, end='')
#     i += 1
# file.close()

file = list(csv.reader(open("Books.csv")))
tmp = []
for row in file:
    tmp.append(row)

for row in tmp:
    if startYear <= int(row[2]) <= endYear:
        print(row)
