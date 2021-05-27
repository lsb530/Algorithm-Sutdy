from itertools import product

data = ['A', 'B', 'C']
result = list(product(data, repeat=2))  # 2개를 뽑는 모든 순열 구하기(중복허용)
print(result)
