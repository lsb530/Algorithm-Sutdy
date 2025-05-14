# 정렬 라이브러리의 시간복잡도 O(NlogN)
array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

result = sorted(array)
print(result)
array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]
array.sort()
print(array)
array = [('바나나', 2), ('사과', 5), ('당근', 3)]


def setting(data):
    return data[1]


def setting_v2(data):
    return data[0]


result = sorted(array, key=setting)
print(result)

result = sorted(array, key=setting_v2)
print(result)
