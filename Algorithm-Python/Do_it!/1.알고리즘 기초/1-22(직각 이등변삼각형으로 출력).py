#   왼쪽 아래가 직각인 이등변삼각형으로 * 출력하기

print('왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.')
n = int(input('짧은 변의 길이를 입력하세요 : '))

for i in range(n):  # 0~n-1까지 반복
    for j in range(i + 1):  # 0~i까지 반복
        print('*', end='')
    print()

# i=0 / j=0, j=1(X)
# i=1 / j=0, j=1, j=2(X)
# i=2 / j=0, j=1, j=2, j=3(X)
