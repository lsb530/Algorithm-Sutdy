from array import *

nums = array('i', [])
for i in range(5):
    num = int(input("Enter number: "))
    nums.append(num)
nums = sorted(nums)
print(nums)
num = int(input("Enter one of number in this array: "))
newArray = array('i', [])
newArray.append(num)
nums.remove(num)
print(f"origin array is {nums}")
print(f"deleted element array is {newArray}")
