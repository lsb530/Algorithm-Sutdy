total = 0
for i in range(5):
    num = int(input("Enter number: "))
    ans = input("Do you want to sum?(y or n): ")
    if ans == 'y':
        total += num
print(f"total is {total}")
