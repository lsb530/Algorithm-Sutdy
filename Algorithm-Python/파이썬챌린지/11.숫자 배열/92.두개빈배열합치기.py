from array import *

nums = array('i', [])
for i in range(3):
    num = int(input("Enter number: "))
    nums.append(num)
arr = array('i', [3, 4, 8, 1, 10, 35])
print(arr)
print(nums)
nums.extend(arr)
nums = sorted(nums)
print("extended", nums)
for x in nums:
    print(x)
