from array import *

nums = array('i', [])
for i in range(5):
    num = int(input("Enter number: "))
    nums.append(num)
print(nums)
num = int(input("Enter number in array: "))
while True:
    if num in nums:
        print(f"index is {nums.index(num)}")
        break
    else:
        num = int(input("Enter number in array: "))
