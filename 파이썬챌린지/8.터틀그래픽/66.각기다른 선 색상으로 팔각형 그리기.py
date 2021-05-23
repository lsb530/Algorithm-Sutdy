import turtle

turtle.shape("turtle")
colors = ["red", "green", "blue", "yellow", "gray", "brown",
          "purple", "pink", "orange"]
for i in range(9):
    turtle.color(colors[i])
    turtle.forward(100)
    turtle.right(40)

turtle.exitonclick()
