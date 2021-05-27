"""
단순 삽입 정렬(Straight Insertion Sort)은 주목한 원소보다 더 앞쪽에서 알맞은 위치로 삽입하며 정렬하는 알고리즘
단순 선택 정렬과 비슷해보이지만, 값이 가장 작은 원소를 선택하지 않는다는 점이 다르다
1. 아직 정렬하지 않은 부분의 맨 앞 원소를 정렬된 부분의 알맞은 위치에 삽입한다.
*장점 : 이미 정렬을 마쳤거나 정렬이 거의 끝나가는 상태에서는 속도가 아주 빠르다
*단점 : 삽입할 위치가 멀리 떨어져 있으면 이동 횟수가 많아진다
"""
# 시간복잡도 : O(n^2)
# 개요
# for i in range(n):
#   tmp <- a[i]를 넣는다
#   tmp를 a[0] ~ a[i - 1]의 알맞은 위치에 삽입한다
"""
종료 조건1 => 정렬된 배열의 왼쪽 끝에 도달한 경우
종료 조건2 => tmp보다 작거나 키값이 같은 원소 a[j-1]을 발견한 경우
을 드모르간의 법칙을 적용하면
계속 조건1 => j가 0보다 큰 경우
계속 조건2 => a[j - 1]의 값이 tmp보다 큰 경우
"""
"""
단순 선택 정렬 알고리즘의 원솟값을 비교하는 횟수 : n^2/2번
이 알고리즘은 서로 떨어져 있는 원소를 교환하지 않으므로 안정적이라고 할 수 있다.
단순 삽입정렬은 셔틀정렬이라고도 한다
"""
from typing import MutableSequence


def insertion_sort(a: MutableSequence) -> None:
    """단순 삽입 정렬"""
    n = len(a)
    for i in range(1, n):
        j = i
        tmp = a[i]
        while j > 0 and a[j - 1] > tmp:
            a[j] = a[j - 1]
            j -= 1
        a[j] = tmp


if __name__ == '__main__':
    print('삽입 정렬을 수행합니다')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))

    insertion_sort(x)  # 배열 x를 단순 교환 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
