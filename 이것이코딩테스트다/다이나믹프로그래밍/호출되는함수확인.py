# 재귀함수로 문제해결 : 탑다운 방식 / 단순 반복문으로 문제해결 : 바텀업 방식
d = [0] * 100


def fibo(x):
    print(f'f({x})', end=' ')
    if x == 1 or x == 2:
        return 1
    if d[x] != 0:
        return d[x]
    d[x] = fibo(x - 1) + fibo(x - 2)
    return d[x]


fibo(6)
