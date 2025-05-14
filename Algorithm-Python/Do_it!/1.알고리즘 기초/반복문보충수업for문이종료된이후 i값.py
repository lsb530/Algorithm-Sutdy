print('반복문이 끝난 후의 i값 살펴보기')
print('1.while i <= n')
i = int(input('i값을 입력하세요 : '))
n = int(input('n값을 입력하세요 : '))
while i <= n:
    i = i + 1
print(f'반복문의 끝난 후의 i값은 {i}입니다.')
print('반복을 종료할 때 i = n + 1')
print()
print('2.for i in range(시작값, n + 1)')
s = int(input('시작값을 입력하세요 : '))
n = int(input('n값을 입력하세요 : '))
for i in range(s, n + 1):
    print('', end='')
print(f'반복문의 끝난 후의 i값은 {i}입니다.')
print('반복을 종료할 때 i = n')
