people = 0
name = input("Enter the name who you want to invite: ")
people += 1
while input("Do you want to invite more?(y or n): ") == 'y':
    people += 1
print(f"invited people is {people}")
