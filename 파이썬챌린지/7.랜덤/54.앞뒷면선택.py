import random

select = input("Enter your select(h or t): ")
answer = random.choice(['h', 't'])
if answer == select:
    print("You win")
else:
    print("Bad luck")
print(f"Computer selected: {answer}")
