compNum = 50
count = 0
num = int(input("Guess number: "))
count += 1
while num != compNum:
    if num < compNum:
        print(f"Your input number {num} is lower")
    else:
        print(f"Your input number {num} is higher")
    num = int(input("Enter number: "))
    count += 1
print(f"Well done, you took {count} attempts")
