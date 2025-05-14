import random

score = 0
for i in range(5):
    n1 = random.randint(1, 50)
    n2 = random.randint(1, 50)
    answer = n1 + n2
    select = int(input("Enter your select number: "))
    if select == answer:
        print("True")
        score += 1
    else:
        print("False")
print(f"You have corrected {score} quiz")
