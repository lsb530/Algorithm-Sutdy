import csv

file = list(csv.reader(open("Books.csv")))
i = 0
for row in file:
    print(f"{i + 1} data - {row}")
    i += 1
