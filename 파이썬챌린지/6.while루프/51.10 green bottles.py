num = 10
print(f"There are {num} green bottles hanging on the wall, "
      f"{num} green bottles hanging on the wall, and if 1 green bottle "
      f"should accidentally fall.")
num -= 1
k = int(input("How many green bottles will be hanging on the wall?: "))
while True:
    if k == num:
        print(f"There will be {num} green bottles hanging on the wall")
        break
    elif k != num:
        print("No, try again")
        print(f"There are {num} green bottles hanging on the wall, "
              f"{num} green bottles hanging on the wall, and if 1 green bottle "
              f"should accidentally fall.")
        num -= 1
        k = int(input("How many green bottles will be hanging on the wall?: "))
    elif num == 0:
        print("There are no more green bottles hanging on the wall")
        break
