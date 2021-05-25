matrix = [[2, 5, 8], [3, 7, 4], [1, 6, 9], [4, 2, 0]]
print(matrix)
row = int(input("Enter which row index you want to see: "))
print(matrix[row])
num = int(input("Enter new data(int): "))
matrix[row].append(num)
print(matrix[row])
