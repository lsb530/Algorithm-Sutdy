from array import *

nums = array('d', [12.53, 20.67, 39.23, 89.15, 52.25])
print(nums)

num = int(input("Enter number(2~5): "))
while num < 2 or num > 5:
    print("Please, enter only 2~5")
    num = int(input("Enter number(2~5): "))
for x in nums:
    print(round(x / num, 2), end=' ')
