money_set = {
    "John": {'N': 3056, 'S': 8463, 'E': 8441, 'W': 2694},
    "Tom": {'N': 4832, 'S': 6786, 'E': 4737, 'W': 3612},
    "Anne": {'N': 5239, 'S': 4802, 'E': 5820, 'W': 1859},
    "Fiona": {'N': 3904, 'S': 3645, 'E': 8821, 'W': 2451},
}
print(money_set)
name, area = map(str, input("Enter name, area: ").split())
print(money_set[name][area])
name, area = map(str, input("Enter where you want to change name, area: ").split())
num = int(input("Enter money: "))
money_set[name][area] = num
print(money_set[name])
