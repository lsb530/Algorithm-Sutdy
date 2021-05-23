firstname = input("Enter your firstname: ")
if len(firstname) < 5:
    surname = input("Enter your surname: ")
    fullname = (firstname + surname).strip(' ').upper()
    print(fullname)
else:
    print(firstname.lower())
