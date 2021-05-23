lst = [123, 456, 789, 7070]
for x in lst:
    print(x)
number = int(input("Enter number: "))
if number in lst:
    print(lst.index(number))
else:
    print("That is not in the list")
