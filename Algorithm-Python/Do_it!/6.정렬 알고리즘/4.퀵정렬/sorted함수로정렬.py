"""
파이썬에서는 정렬을 수행하는 sorted() 함수를 내장 함수로 제공한다.
이 함수는 전달받은(임의의 자료형) 이터러블 객체의 원소를 정렬하여 list형으로 반환한다.
sorted() 함수는 '정렬을 직접 수행(inplace)'하지 않고 '정렬을 수행한 뒤 늘어선 원소를 새로운 리스트로 생성하여 반환'한다.
Ex) a, b = sorted([a, b])               # a, b를 오름차순으로 정렬
    a, b, c = sorted([a, b, c])         # a, b, c를 오름차순으로 정렬
    a, b, c, d = sorted([a, b, c, d])   # a, b, c, d를 오름차순으로 정렬
이 3가지 예시에는 변수(a, b, ...)를 나열한 리스트를 sorted() 함수에 전달하고, 반환된 리스트를 풀어(unpack)
변수(a, b, ...)에 대입한다. sorted()함수는 오름차순을 기본으로 하지만, reverse에 True값을 넘겨주면 내림차순 정렬을 한다.
! 튜플은 Immutable의 속성을 가지므로 튜플 자체를 정렬할 수는 없다. 튜플을 정렬해야 한다면 다음과 같은 2단계 방법을 사용
    1.sorted() 함수로 정렬한 원소의 나열에서 새로운 리스트를 생성한다.
    2.생성한 리스트를 튜플로 변환한다.
"""
# sorted() 함수를 사용하여 정렬하기

print('sorted() 함수를 사용하여 정렬합니다.')
num = int(input('원소 수를 입력하세요.: '))
x = [None] * num

for i in range(num):
    x[i] = int(input(f'x[{i}]: '))

# 배열 x를 오름차순으로 정렬
x = sorted(x)
print('오름차순으로 정렬했습니다.')
for i in range(num):
    print(f'x[{i}] = {x[i]}')

# 배열 x를 내림차순으로 정렬
x = sorted(x, reverse=True)
print('내림차순으로 정렬했습니다.')
for i in range(num):
    print(f'x[{i}] = {x[i]}')

y = (1, 3, 2)
y = tuple(sorted(y))
print(y)
