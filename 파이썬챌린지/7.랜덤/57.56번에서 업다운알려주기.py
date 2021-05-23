import random

answer = random.randint(1, 10)
while answer != select:
    if select < answer:
        print("Too low")
    else:
        print("Too high")
    select = int(input("Enter your select(1 ~ 10): "))
