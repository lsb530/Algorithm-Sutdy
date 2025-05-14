nums = []
while len(nums) != 3:
    num = int(input("Enter number: "))
    nums.append(num)
answer = input("Do you really want to add last number?(y or n): ")
if answer == 'n':
    nums.remove(nums[len(nums)-1])
print(nums)
