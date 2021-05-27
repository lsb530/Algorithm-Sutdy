# 파이썬의 논리연산자는 다른 프로그래밍 언어와 전혀 다른 성격을 갖고 있다.

# x and y: x를 평가하여 거짓이면 그 값을 생성한다. 그렇지 않으면 y를 평가하여 그 값을 생성한다.
# x or y : x를 평가하여 참이면 그 값을 생성한다. 그렇지 않으면 y를 평가하여 그 값을 생성한다.
# not x : x가 참이면 False, 그렇지 않으면 True를 생성합니다.
# 우선순위 : not / and / or
"""
ex) 5 or 3 => 5 이유 : 5가 참이니깐 x를 출력.
    0 or 3 => 3 이유 : 0이 거짓이니깐 y를 출력. 고로 3
    5 and 3 => 3 이유 : 5가 참이니깐 y를 출력.
    0 and 3 => 0 이유 : 0이 거짓이니깐 x를 출력
즉, True나 False가 없다
또한 and 연산자와 or 연산자는 논리 연산의 평가 결과가 왼쪽 피연산자의 평가 결과만으로 명확해질 경우에 오른쪽 피연산자의 평가를
생략하는 단축 평가(short circuit evaluation)을 수행한다.
# and 연산자의 왼쪽 피연산자를 평가한 값이 거짓이면, 오른쪽 피연산자의 평가를 생략한다
# or 연산자의 왼쪽 피연산자를 평가한 값이 참이면, 오른쪽 피연산자의 평가를 생략한다
EX) x and y 일때 (참 and 거짓) => 거짓인 y를 출력 / (거짓 and 참) => 거짓인 x를 출력
    x or y 일때 (참 or 거짓) => 참인 x를 출력 / (거짓 or 참) => 참인 y를 출력
"""
# x and y 일때 참 and 거짓 => 거짓인 y를 출력.
print('and 와 or 비교')
# x = int(input('x입력 : '))
# y = int(input('y입력 : '))
# print(f'x and y = {x and y} ({x} and {y})')
# print(f'x or y = {x or y} ({x} or {y})')

print(f'5 and 3 => {5 and 3}')
print(f'5 or 3 => {5 or 3}')
print(f'0 and 3 => {0 and 3}')
print(f'0 or 3 => {0 or 3}')
print(f'3 and 0 => {3 and 0}')
print(f'3 or 0 => {3 or 0}')

y = 7
x = y = 3
