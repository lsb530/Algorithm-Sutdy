# 선택정렬, 시간 복잡도 O(N^2)
array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
    min_index = i  # 가장 작은 원소의 인덱스
    for j in range(i + 1, len(array)):
        if array[min_index] > array[j]:
            min_index = j
    array[i], array[min_index] = array[min_index], array[i]  # 스와프

print(array)

# 파이썬에서의 스와프(Swap)
array = [3, 5]
array[0], array[1] = array[1], array[0]
print(array)

# 기타(C)에서의 스와프(Swap)
a: int = 3
b: int = 5

temp: int = a
a = b
b = temp
print(a, b)
