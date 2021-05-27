# [Do it! 실습 6-5] 셰이커 정렬 알고리즘 구현하기
"""
홀수 패스에서는 가장 작은 원소를 맨 앞으로 이동시키고
짝수 패스에서는 가장 큰 원소를 맨 뒤로 이동시켜 패스의 스캔 방향을 바꾼다.
이렇게 버블 정렬을 개선한 알고리즘을 셰이커정렬(shaker sort)이라고 하며, 양방향버블정렬(bidirectional bubble sort),
칵테일정렬(cocktail sort),칵테일 셰이커 정렬(cocktail shaker sort)라고도 합니다.
"""
from typing import MutableSequence


def shaker_sort(a: MutableSequence) -> None:
    """셰이커 정렬"""
    left = 0
    right = len(a) - 1
    last = right
    while left < right:
        for j in range(right, left, -1):
            if a[j - 1] > a[j]:
                a[j - 1], a[j] = a[j], a[j - 1]
                last = j
        left = last

        for j in range(left, right):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
                last = j
        right = last


if __name__ == '__main__':
    print('셰이커 정렬을 수행합니다')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))

    shaker_sort(x)  # 배열 x를 단순 교환 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
