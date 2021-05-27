# 리스트에서 3개를 뽑아 나열하는 모든 경우를 출력
from itertools import permutations

data = ['A', 'B', 'C']
result = list(permutations(data, 3))  # 모든 순열 구하기
print(result)
