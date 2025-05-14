file = open("Numbers.txt", "w")
for num in range(5):
    if num != 4:
        file.write(f"{num + 1}, ")
    else:
        file.write(f"{num + 1}")
file.close()
