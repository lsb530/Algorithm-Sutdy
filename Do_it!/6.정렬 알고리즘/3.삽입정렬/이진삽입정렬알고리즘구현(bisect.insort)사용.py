# 이진 삽입 정렬 알고리즘 구현(bisect.insort) 사용
"""
bisect.insort(a, x, low, high)를 호출하면
a가 이미 정렬된 상태를 유지하면서 a[low]~a[high] 사이에 x를 삽입합니다.
만약 a안에 x와 같은 값을 갖는 원소가 여러개있으면 가장 오른쪽 위치에 삽입합니다.
"""
import bisect
from typing import MutableSequence


def binary_insertion_sort(a: MutableSequence) -> None:
    """이진 삽입 정렬(bisect.insort 사용)"""
    for i in range(1, len(a)):
        bisect.insort(a, a.pop(i), 0, i)


if __name__ == '__main__':
    print('이진 삽입 정렬을 수행합니다.')
    num = int(input('원소 수를 입력하세요 : '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}]: '))

    binary_insertion_sort(x)  # 배열 x를 버블 정렬
    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
