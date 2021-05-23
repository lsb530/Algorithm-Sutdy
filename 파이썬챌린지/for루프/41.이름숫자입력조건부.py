name = input("Enter your name: ")
num = int(input("Enter how many repeat do you want?: "))
if num < 10:
    for i in range(num):
        print(name)
else:
    print("Too high")
