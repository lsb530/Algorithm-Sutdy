menu = """1) Create a new file
2) Display the file
3) Add a new item to the file
"""
print(menu)
select = int(input("Make a selection 1, 2 or 3: "))
if select == 1:
    file = open("Subject.txt", "w")
    subject = input("Enter a subject: ")
    file.write(subject + '\n')
    file.close()
elif select == 2:
    file = open("Subject.txt", "r")
    print(file.read())
    file.close()
elif select == 3:
    file = open("Subject.txt", "a")
    subject = input("Enter a new subject: ")
    file.write(subject + '\n')
    file.close()
else:
    print("Input Error")
