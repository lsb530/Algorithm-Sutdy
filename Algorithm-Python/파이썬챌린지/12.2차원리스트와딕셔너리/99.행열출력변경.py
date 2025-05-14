matrix = [[2, 5, 8], [3, 7, 4], [1, 6, 9], [4, 2, 0]]
print(matrix)
row = int(input("Enter which row index you want to see: "))
print(matrix[row])
column = int(input("Enter which column index you want to see: "))
print(matrix[row][column])
change = input("Do you want to change value?(y or n): ")
if change == 'y':
    num = int(input("Enter new number: "))
    matrix[row][column] = num
print(matrix)
