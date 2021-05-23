x = input("Enter up or down: ")
if x == "up":
    num = int(input("Enter biggest number: "))
    for i in range(1, num + 1):
        print(i)
elif x == "down":
    num = int(input("Enter number(under 20): "))
    for i in range(20, num - 1, -1):
        print(i)
else:
    print("I don't understand")
