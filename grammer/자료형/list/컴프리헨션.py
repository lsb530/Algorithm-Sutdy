# 원래의 코드
array = []
for i in range(20):
    if i % 2 == 1:
        array.append(i)
print(array)

# 0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]
print(array)

# 1부터 9까지의 제곱값을 포함하는 리스트
array = [i * i for i in range(1, 10)]
print(array)

# N * M 크기의 2차원 리스트를 초기화(_는 변수를 이용할 필요가 없을 때 무시 가능)
n = 3
m = 4
array = [[0] * m for _ in range(n)]
print(array)
array[1][1] = 5
print(array)

# N X M 크기의 2차원 리스트 초기화(잘못된 방법)
n = 3
m = 4
array = [[0] * m] * n
print(array)
array[1][1] = 5
print(array)
