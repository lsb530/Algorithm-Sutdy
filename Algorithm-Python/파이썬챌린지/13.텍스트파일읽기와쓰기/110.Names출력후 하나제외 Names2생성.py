file = open("Names.txt", "r")
print(file.read())
file.close()
names = []
exclude = input("Which name do you want to exclude?: ")
file = open("Names.txt", "r")
for row in file:
    name = row.strip('\n')
    if name != exclude:
        names.append(name)
file.close()
moveTo = open("Names2.txt", "w")
for name in names:
    moveTo.write(f"{name}\n")
print(names)
