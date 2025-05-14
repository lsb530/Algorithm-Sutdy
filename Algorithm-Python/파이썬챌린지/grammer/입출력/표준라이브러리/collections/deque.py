from collections import deque

data = deque([2, 3, 4])
data.appendleft(1)  # 첫 번째 인덱스에 원소 삽입
data.append(5)  # 마지막 인덱스에 원소 삽입

print(data)
print(list(data))  # 리스트 자료형으로 변환
