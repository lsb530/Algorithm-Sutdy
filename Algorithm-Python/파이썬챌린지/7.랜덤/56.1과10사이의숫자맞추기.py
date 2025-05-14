import random

answer = random.randint(1, 10)
select = int(input("Enter your select(1 ~ 10): "))
while answer != select:
    select = int(input("Enter your select(1 ~ 10): "))
