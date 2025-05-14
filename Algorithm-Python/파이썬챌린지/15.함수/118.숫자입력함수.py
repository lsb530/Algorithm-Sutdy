def num_save() -> int:
    num = int(input("Enter number: "))
    return num


def num_count(num: int) -> None:
    for i in range(1, num + 1):
        print(i, end=' ')


num = num_save()
num_count(num)
