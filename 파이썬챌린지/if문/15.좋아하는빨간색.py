color = input("Which color do you like?: ")
answer = "red"
if color == answer or color == answer.upper() or color == answer.capitalize():
    print("I like red too")
else:
    print("I don't like that color, I prefer red")
