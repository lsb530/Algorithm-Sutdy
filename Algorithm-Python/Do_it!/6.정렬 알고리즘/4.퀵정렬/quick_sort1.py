"""
퀵 정렬 만들기
[5, 8, 4, 2, 6, 1, 3, 9, 7]을 피벗을 6으로 해서 pl pr과 교환을 1번 하면
[5, 3, 4, 2, 1, 6, 8, 9, 7]이 된다.
여기에서 또 [5,3,4,2,1]과 [6,8,9,7]로 분할하고 또 피벗을 정하고 또 분할한다..(재귀적 반복)
원소 수가 1개인 그룹은 더 이상 나눌 필요가 없으므로 원소 수가 2개 이상인 그룹만 다음과 같이 반복해서 나눈다.
- pr가 a[0]보다 오른쪽에 위치하면(left < pr) 왼쪽 그룹을 나눈다.
- pl이 a[8]보다 왼쪽에 위치하면(pl < right) 오른쪽 그룹을 나눈다.
* 가운데 그룹(a[pr+1]~a[pl-1])은 나눌 필요가 없으므로 제외한다.

퀵 정렬은 앞에서 살펴본 8퀸 문제와 같은 분할정복 알고리즘이므로 재귀 호출을 사용하여 구현가능하다.
하지만 퀵 정렬은 서로 이웃하지 않는 원소를 교환하므로 안정적이지 않은 알고리즘이다.
qsort()함수는 배열 a, 나누는 구간의 첫번째 원소(left), 마지막 원소(right)의 인덱스(index)를 전달받아 퀵 정렬을 수행한다.
A: [ 5, 8, 4, 2, 6, 1, 3, 9, 7 ]
     0  1  2  3  4  5  6  7  8  - 인덱스
- left = 0, right = 8
B: [ 5, 3, 4, 2, 1]
- left = 0, right = 4
C: [ 6, 8, 9, 7]
- left = 5, right = 8
"""
# 퀵 정렬 알고리즘 구현하기

from typing import MutableSequence


def qsort(a: MutableSequence, left: int, right: int) -> None:
    """a[left] ~ a[right]를 퀵 정렬"""
    pl = left  # 왼쪽 커서
    pr = right  # 오른쪽 커서
    x = a[(left + right) // 2]  # 피벗(가운데 원소)

    while pl <= pr:  # 나누는 과정을 수행
        while a[pl] < x: pl += 1
        while a[pr] > x: pr -= 1
        if pl <= pr:
            a[pl], a[pr] = a[pr], a[pl]
            pl += 1
            pr -= 1

    # 좌우 각 그룹을 다시 나누기 위해 재귀호출 추가
    if left < pr: qsort(a, left, pr)
    if pl < right: qsort(a, pl, right)


def quick_sort(a: MutableSequence) -> None:
    """퀵 정렬"""
    qsort(a, 0, len(a) - 1)


if __name__ == '__main__':
    print('퀵 정렬을 수행합니다')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))

    quick_sort(x)  # 배열 x를 단순 교환 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
