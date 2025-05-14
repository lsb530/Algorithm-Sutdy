"""
단순 선택 정렬(Straight Selection Sort)은 가장 작은 원소부터 선택해 알맞은 위치로 옮기는 작업을 반복하며 정렬하는 알고리즘
1. 아직 정렬하지 않은 부분에서 값이 가장 작은 원소 a[min]을 선택합니다.
2. a[min]과 아직 정렬하지 않은 부분에서 맨 앞에 있는 원소를 교환합니다.
"""
# 시간복잡도 : O(n^2)
# 개요
# for i in range(n - 1):
#   min #a[i]~a[n-1]에서 가장 작은 원소의 인덱스
#   a[i]와 a[min]의 값을 교환
"""
단순 선택 정렬 알고리즘의 원솟값을 비교하는 횟수 : (n^2-n)/2번
하지만 이 알고리즘은 서로 이웃하지 않는 떨어져 있는 원소를 교환하므로 안정적이지 않다.
중복된 원소조차 자리를 바꾸므로 안정적이라고 할 수 없다.
"""
from typing import MutableSequence


def selection_sort(a: MutableSequence) -> None:
    """단순 선택 정렬"""
    n = len(a)
    for i in range(n - 1):
        min = i  # 정렬할 부분에서 가장 작은 원소의 인덱스
        for j in range(i + 1, n):
            if a[j] < a[min]:
                min = j
        a[i], a[min] = a[min], a[i]  # 정렬할 부분에서 맨 앞의 원소와 가장 작은 원소를 교환


if __name__ == '__main__':
    print('선택 정렬을 수행합니다')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))

    selection_sort(x)  # 배열 x를 단순 교환 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
