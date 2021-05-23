invite = []
for x in range(3):
    name = input("Enter name who you want to invite party: ")
    invite.append(name)
while input("Add more(y or n)?: ") != 'n':
    name = input("Enter name who you want to invite party: ")
    invite.append(name)
print(invite)
name = input("Enter name in the list: ")
print(f"This person of index is {invite.index(name)}")
ask = input("Do you really want to invite that person(y or n)?: ")
if ask == 'n':
    del invite[invite.index(name)]
print(invite)
