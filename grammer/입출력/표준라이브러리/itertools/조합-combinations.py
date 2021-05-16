# 리스트에서 2개를 뽑아 순서에 상관없이 나열하는 모든 경우를 출력
from itertools import combinations

data = ['A', 'B', 'C']
result = list(combinations(data, 2))  # 2개를 뽑는 모든 조합 구하기
print(result)
