def add_name():
    name = input("Enter a new name: ")
    names.append(name)
    return names


def change_name():
    view_names()
    select = int(input("Enter the number of the name you want to change: "))
    name = input("Enter new name: ")
    names[select] = name
    return names


def delete_name():
    view_names()
    select = int(input("Enter the number of the name you want to delete: "))
    del names[select]
    return names


def view_names():
    for idx, val in enumerate(names):
        print(idx, val)
    print()


def main():
    again = 'y'
    while again == 'y':
        menu = """1) Add a name\n2) Change a name\n3) Delete a name\n4) View names\n5) Quit"""
        print(menu)
        select = int(input("What do you want to do?: "))
        if select == 1:
            add_name()
        elif select == 2:
            change_name()
        elif select == 3:
            delete_name()
        elif select == 4:
            view_names()
        elif select == 5:
            again = 'n'
        else:
            print("Incorrect option")


names = []
main()
