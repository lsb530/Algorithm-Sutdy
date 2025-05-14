import turtle

turtle.shape("turtle")
colors = ["red", "green", "blue", "yellow", "gray", "brown", "purple", "pink"]
for i in range(8):
    turtle.color(colors[i])
    turtle.forward(100)
    turtle.right(135)

turtle.exitonclick()
