msg = input("Enter message(Upper): ")
again = True
while again:
    if msg.isupper():
        print("Thank you")
        again = False
    else:
        print("Try again")
        msg = input("Enter message(Upper): ")