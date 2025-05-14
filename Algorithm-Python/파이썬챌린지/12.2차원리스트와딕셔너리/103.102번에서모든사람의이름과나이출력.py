shoes = {}
for i in range(4):
    name = input(f"Enter {i + 1} index name: ")
    age, size = map(int, input("Enter age, shoe size: ").split())
    shoes[name] = {"age": age, "size": size}
print(shoes)

for i in shoes:
    print(f"name: {i}, age: {shoes[i]['age']}")
