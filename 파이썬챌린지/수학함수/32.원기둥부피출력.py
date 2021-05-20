import math

radius = int(input("Enter radius: "))
height = int(input("Enter height: "))
circle_area = radius ** 2 * math.pi
volume = circle_area * height
print(round(volume, 3))
