import turtle

turtle.shape("turtle")
colors = ["red", "blue", "green"]
for i in range(3):
    turtle.pendown()
    turtle.color("black", colors[i])
    turtle.begin_fill()
    for j in range(4):
        turtle.forward(70)
        turtle.right(90)
    turtle.penup()
    turtle.end_fill()
    turtle.forward(100)

turtle.exitonclick()