import random

colors = ['red', 'blue', 'yellow', 'brown', 'gray']
answer = random.choice(colors)
print(f"colors : {colors}")
select = input("Enter your select color: ")
while select != answer:
    print(f"You are probably feeling {answer} right now.")
    select = input("Enter your select color: ")
print("Well done")
