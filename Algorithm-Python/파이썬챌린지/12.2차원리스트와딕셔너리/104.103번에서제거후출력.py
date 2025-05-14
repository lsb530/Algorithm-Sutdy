shoes = {}
for i in range(4):
    name = input(f"Enter {i + 1} index name: ")
    age, size = map(int, input("Enter age, shoe size: ").split())
    shoes[name] = {"age": age, "size": size}
print(shoes)

name = input("Enter name who you want to delete: ")
del shoes[name]
print(shoes)
