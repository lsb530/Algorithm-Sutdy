from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(counter['blue'])  # 'blue' 등장한 횟수 출력
print(counter['green'])  # 'green' 등장한 횟수 출력
print(dict(counter))  # 사전 자료형으로 변환

counter = Counter([1, 3, 3, 3, 3, 5, 8, 1, 9, 10, 9])

print(counter[3])  # 3 등장한 횟수 출력
print(counter[1])  # 1 등장한 횟수 출력
print(dict(counter))
