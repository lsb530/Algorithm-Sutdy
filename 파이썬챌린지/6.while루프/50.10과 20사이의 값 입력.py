num = int(input("Enter number(between 10 and 20): "))
while num <= 10 or num >= 20:
    if num <= 10:
        print("Too low")
        num = int(input("Enter number(between 10 and 20): "))
    elif num >= 20:
        print("Too high")
        num = int(input("Enter number(between 10 and 20): "))
print("Thank you")
