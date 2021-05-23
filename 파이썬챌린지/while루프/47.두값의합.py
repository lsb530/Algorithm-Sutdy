num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
hap = num1 + num2
while input("Do you want to add more?(y or n): ") == 'y':
    num2 = int(input("Enter number: "))
    hap += num2
print(f"Total sum is {hap}")
