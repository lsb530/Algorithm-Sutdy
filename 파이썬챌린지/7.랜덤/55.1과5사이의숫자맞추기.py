import random

answer = random.randint(1, 5)
select = int(input("Enter your select(1 ~ 5): "))
if answer == select:
    print("Well done")
else:
    if select < answer:
        print("Your selection is lower than answer")
        select = int(input("Enter your select(1 ~ 5): "))
        if answer == select:
            print("Correct")
        else:
            print("You lose")
    else:
        print("Your selection is higher than answer")
        select = int(input("Enter your select(1 ~ 5): "))
        if answer == select:
            print("Correct")
        else:
            print("You lose")
