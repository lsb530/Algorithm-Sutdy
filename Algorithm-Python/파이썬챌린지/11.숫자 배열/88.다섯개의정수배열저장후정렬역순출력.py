from array import *

nums = array('i', [])
for i in range(5):
    num = int(input("Enter number: "))
    nums.append(num)
nums = sorted(nums)
print(nums)
nums.reverse()
print(nums)
