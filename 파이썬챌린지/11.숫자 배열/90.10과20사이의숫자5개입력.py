from array import *

nums = array('i', [])
while len(nums) < 5:
    num = int(input("Enter number: "))
    if 10 <= num <= 20:
        nums.append(num)
    else:
        print("Outside the range")
print("Thank you")
for x in nums:
    print(x)
