from array import *

nums = array('i', [])
for i in range(5):
    num = int(input("Enter number: "))
    nums.append(num)
print(nums)
num = int(input("Enter one of numbers: "))
print(f"array have {nums.count(num)} of {num}")
