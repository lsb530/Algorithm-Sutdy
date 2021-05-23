invite = []
for x in range(3):
    name = input("Enter name who you want to invite party: ")
    invite.append(name)
while input("Add more(y or n)?: ") != 'n':
    name = input("Enter name who you want to invite party: ")
    invite.append(name)
print(f"You invited {len(invite)} people")
