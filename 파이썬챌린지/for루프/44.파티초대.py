num = int(input("How many people do you want to invite party?: "))
if num < 10:
    for i in range(num):
        name = input("What's your name?: ")
        print(f"{name} has been invited")
else:
    print("Too many people")
