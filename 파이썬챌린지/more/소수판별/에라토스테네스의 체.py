# 배수를 찾아서 제거, 남은 수 중에서 가장 작은 제곱근까지만 증가시켜 확인
# O(NloglogN)
# 장점: 빠르다
# 단점: 메모리가 많이 필요하다. 예를 들어 N = 1,000,000일 때는 2부터 N까지의
# 모든 수에 대한 정보를 담을 수 있는 크기의 리스트가 필요하다
import math

n = 1000  # 2부터 1,000까지의 모든 수에 대하여 소수 판별
# 처음엔 모든 수가 소수(True)인 것으로 초기화(0과 1은 제외)
array = [True for i in range(n + 1)]

# 에라토스테네스의 체 알고리즘
for i in range(2, int(math.sqrt(n)) + 1):  # 2부터 n의 제곱근까지의 모든 수를 확인
    if array[i]:  # i가 소수인 경우(남은 수인 경우)
        # i를 제외한 i의 모든 배수를 지우기
        j = 2
        while i * j <= n:
            array[i * j] = False
            j += 1
# 모든 소수 출력
k = 0
for i in range(2, n + 1):
    if array[i]:
        print(i, end=' ')
        k += 1
        if k == 5:
            print()
            k = 0
