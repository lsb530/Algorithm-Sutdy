import random


def answer_check(answer: int) -> None:
    guess = int(input("Please input what answer is : "))
    if guess == answer:
        print("Correct")
    else:
        print(f"Incorrect, the answer is {answer}")


def main() -> None:
    menu = """1) Addition\n2) Subtraction\nEnter 1 or 2: """
    select = int(input(menu))

    if select == 1:
        num1 = random.randint(5, 20)
        num2 = random.randint(5, 20)
        answer = num1 + num2
        answer_check(answer)
    elif select == 2:
        num1 = random.randint(25, 50)
        num2 = random.randint(5, 20)
        answer = num1 - num2
        answer_check(answer)
    else:
        print("You should correct select menu")


main()
