def solution1(arr1, arr2):
    answer = []
    tmp = []
    for i, j in zip(arr1, arr2):
        for x, y in zip(i, j):
            tmp.append(x + y)
        answer.append(tmp)
        tmp = []
    return answer


def solution2(arr1, arr2):
    for i in range(len(arr1)):  # 행
        for j in range(len(arr1[0])):  # 열
            arr1[i][j] += arr2[i][j]
    return arr1


arr1 = [[1, 2], [2, 3]]
arr2 = [[3, 4], [5, 6]]
solution1(arr1, arr2)
arr3 = [[1], [2]]
arr4 = [[4], [6]]
solution2(arr3, arr4)
