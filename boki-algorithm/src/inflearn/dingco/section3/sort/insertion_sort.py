input = [4, 6, 2, 9, 1]


def print_index(array):
    n = len(array)
    for i in range(1, n):
        for j in range(i):
            print(i - j)
        print()


print_index(input)

# O(N^2)~O(N)
def insertion_sort(array):
    n = len(array)
    for i in range(1, n):
        for j in range(i):
            if array[i - j] < array[i - j - 1]:
                array[i - j], array[i - j - 1] = array[i - j - 1], array[i - j]
            else:
                break
    return array


print("정답 = [4, 5, 7, 7, 8] / 현재 풀이 값 = ", insertion_sort([5, 8, 4, 7, 7]))
print("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ", insertion_sort([3, -1, 17, 9]))
print("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ", insertion_sort([100, 56, -3, 32, 44]))
