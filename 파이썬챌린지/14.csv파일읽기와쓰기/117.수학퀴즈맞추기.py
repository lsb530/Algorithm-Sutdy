import random

score = 0
name = input("What's your name?: ")
matrix = [[0] * 2 for i in range(2)]
for i in range(2):
    num1 = random.randint(10, 50)
    num2 = random.randint(10, 50)
    question = f"{num1}+{num2}="
    guess = int(input(question))
    answer = num1 + num2
    if guess == answer:
        score += 1
        chGuess = str(guess) + '(O)'
    else:
        chGuess = str(guess) + '(X)'
    for j in range(2):
        if j == 0:
            matrix[i][j] = question
        else:
            matrix[i][j] = chGuess
file = open("QuizScore.csv", "a")
result = f"{name},"
for i in range(2):
    newRecord = f"{matrix[i][0]}{matrix[i][1]},"
    result += newRecord
result += f"score={score}\n"
file.write(result)
file.close()
