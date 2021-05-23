foods = dict()
for i in range(4):
    food = input(f"({i + 1}번째/4) Please Enter "
                 f"food name which do you like: ")
    foods[i + 1] = food
print(foods)
i = int(input("Which food do you want to remove(index)?: "))
del foods[i]
# print(sorted(foods))
print(sorted(foods.values()))
