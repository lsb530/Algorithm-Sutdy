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


def delete_record():
    file = open("Salaries.csv", "r")
    tmplist = []
    for row in file:
        tmplist.append(row)
    file.close()
    for idx, val in enumerate(tmplist):
        print(idx, val, end='')
    select = int(input("Enter the row number to delete: "))
    del tmplist[select]
    file = open("Salaries.csv", "w")
    for row in tmplist:
        file.write(row)
    file.close()


def main():
    again = True
    while again:
        menu = """1) Add to file\n2) View all records\n3) Delete a record\n4) Quit Program"""
        print(menu)
        select = int(input("Enter the number of your selection: "))
        if select == 1:
            add_to_file()
        elif select == 2:
            view_records()
        elif select == 3:
            delete_record()
        elif select == 4:
            again = False
        else:
            print("Incorrect option")


main()
