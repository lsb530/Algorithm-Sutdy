while True:
    n = int(input("Enter number(more than 100): "))
    if n > 100:
        break
while True:
    m = int(input("Enter number(less than 10): "))
    if m < 10:
        break

print(f"{m} goes into {n}, {n // m} times")
