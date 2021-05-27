# M 이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하라
# 1 <= M <= N <= 1,000,000

# 에라토스테네스의 체 알고리즘 이용
import math

m, n = map(int, input().split())
array = [True for i in range(1000001)]  # 처음에는 모든 수를 소수(True)로 초기화
array[1] = False  # 1은 소수가 아님

for i in range(2, int(math.sqrt(n)) + 1):
    if array[i]:
        j = 2
        while i * j <= n:
            array[i * j] = False
            j += 1

for i in range(m, n + 1):
    if array[i]:
        print(i)
