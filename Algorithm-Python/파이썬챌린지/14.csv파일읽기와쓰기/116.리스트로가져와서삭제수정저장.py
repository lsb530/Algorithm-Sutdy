import csv

file = list(csv.reader(open("Books.csv")))
books = []
for book in file:
    books.append(book)
print()
x = 0
for book in books:
    display = x, books[x]
    print(display)
    x += 1
select = int(input("Which row do you want to delete?: "))
del books[select]

x = 0
for book in books:
    display = x, books[x]
    print(display)
    x += 1
alter = int(input("Enter a row number to alter: "))
x = 0
for book in books[alter]:
    display = x, books[alter][x]
    print(display)
    x += 1
part = int(input("Which part do you want to change?: "))
newData = input("Enter new data: ")
books[alter][part] = newData
print(books[alter])

file = open("Books.csv", "w")
for book in books:
    newRecord = f"{book[0]},{book[1]},{book[2]}\n"
    file.write(newRecord)
file.close()
