import random
import time
numbers = [0 * 3 for i in range(3)]  # 초기화 연습용으로 ..

def number_input_and_between() -> int:
    low, high = 0, 0
    print("Guess between value(low <= answer <= high)")
    while True:
        low, high = map(int, input("Enter low and high number(a, b): ").split())
        if low > high:
            print("left value is higher than right value. Please Input again")
        elif low == high:
            print("left and right value is same. Please Input again")
        else:
            break
    print("I am thinking of a number....")
    time.sleep(2)
    between = random.randint(low, high)
    numbers[0], numbers[1], numbers[2] = low, between, high
    return low, between, high

low, between, high = number_input_and_between()
# print(f"between is : {between}")
answer = int(input(f"Enter answer between {low} and {high}: "))
while answer != between:
    if answer < low or answer > high:
        print("Out of answer range")
    elif answer > between:
        print("Higher than answer")
    else:
        print("Lower than answer")
    answer = int(input(f"Enter answer between {low} and {high}: "))
print("Correct you win!")
