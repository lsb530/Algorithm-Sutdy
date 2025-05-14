print("1) Square\n2) Triangle")
n = int(input("Enter: "))
if n == 1:
    row = int(input("Enter row: "))
    column = int(input("Enter column: "))
    print(f"area = {row * column}")
elif n == 2:
    row = int(input("Enter row: "))
    height = int(input("Enter height: "))
    print(f"area = {row * height / 2}")
else:
    print("Invalid Input")
