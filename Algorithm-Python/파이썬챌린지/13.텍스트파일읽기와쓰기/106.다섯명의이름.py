file = open("Names.txt", "w")
for i in range(5):
    name = input("Enter name: ")
    file.write(f"{name}\n")
file.close()
