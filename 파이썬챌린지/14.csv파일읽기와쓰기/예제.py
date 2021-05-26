import csv

file = open("Stars.csv", "w")
newRecord = "Brian,73,Taurus\n"
file.write(str(newRecord))
file.close()

file = open("Stars.csv", "a")
name = input("Enter name: ")
age = input("Enter age: ")
star = input("Enter start sign: ")
newRecord = f"{name},{age},{star}\n"
file.write(str(newRecord))
file.close()

file = open("Stars.csv", "r")
for row in file:
    print(row)
file.close()

file = open("Stars.csv", "r")
reader = csv.reader(file)
rows = list(reader)
print(rows[1])
file.close()

file = open("Stars.csv", "r")
search = input("Enter the data you are searching for: ")
for row in file:
    if search in str(row):
        print(row)
file.close()

file = list(csv.reader(open("Stars.csv")))
tmp = []
for row in file:
    tmp.append(row)
print(tmp)

file = open("NewStars.csv", "w")
x = 0
for row in tmp:
    newRec = tmp[x][0] + "," + tmp[x][1] + "," + tmp[x][2] + "\n"
    file.write(newRec)
    x += 1
file.close()
