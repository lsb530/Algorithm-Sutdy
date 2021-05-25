password = input("Enter the password: ")
check = input("Enter the password: ")
if password == check:
    print("Thank you")
elif password == check.upper() or password == check.lower():
    print("They must be in the same case")
else:
    print("Incorrect")
