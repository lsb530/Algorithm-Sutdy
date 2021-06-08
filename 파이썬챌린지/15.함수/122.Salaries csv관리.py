def add_to_file():
    file = open("Salaries.csv", "a")
    name = input("Enter name: ")
    salary = int(input("Enter salary: "))
    file.write(f"{name},{salary}\n")
    file.close()


def view_records():
    file = open("Salaries.csv", "r")
    for row in file:
        print(row, end='')
    file.close()


def main():
    again = True
    while again:
        menu = """1) Add to file\n2) View all records\n3) Quit Program"""
        print(menu)
        select = int(input("Enter the number of your selection: "))
        if select == 1:
            add_to_file()
        elif select == 2:
            view_records()
        elif select == 3:
            again = False
        else:
            print("Incorrect option")


main()
