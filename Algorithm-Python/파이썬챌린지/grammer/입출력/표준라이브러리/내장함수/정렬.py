# 오름차순 정렬
result = sorted([9, 1, 8, 5, 4])
print(result)

# 내림차순 정렬
result = sorted([9, 1, 8, 5, 4], reverse=True)
print(result)

# 튜플의 두번째 원소(숫자)를 기준으로 내림차순 정렬
tu = [('홍길동', 35), ('이순신', 75), ('아무개', 50)]
result = sorted(tu, key=lambda x: x[1], reverse=True)
print(result)

# 리스트
data = [9, 1, 8, 5, 4]
data.sort()
print(data)
