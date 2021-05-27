# 배열을 두 그룹으로 나누기
"""
이 프로그램에서는 배열 가운데에 있는 원소를 피벗으로 선택했다.
피벗은 어떤 값으로 선택하느냐에 따라 배열을 나누는 것 과 성능(performance)에 영향을 미친다.
이 내용은 '피벗 선택하기'에서 자세히 알아본다. 지금은 배열 가운데에 있는 원소를 피벗으로 선택한다.
"""
from typing import MutableSequence


def partition(a: MutableSequence) -> None:
    """배열을 나누어 출력"""
    n = len(a)
    pl = 0  # 왼쪽 커서
    pr = n - 1  # 오른쪽 커서
    x = a[n // 2]  # 피벗(가운데 원소)

    while pl <= pr:  # 배열 a를 피벗 x로 나누기
        while a[pl] < x: pl += 1
        while a[pr] > x: pr -= 1
        if pl <= pr:
            a[pl], a[pr] = a[pr], a[pl]
            pl += 1
            pr -= 1

    print(f'피벗은 {x}입니다.')
    print('피벗 이하인 그룹입니다.')
    print(*a[0:pl])  # a[0] ~ a[pl-1]

    if pl > pr + 1:
        print('피벗과 일치하는 그룹입니다.')
        print(*a[pr + 1: pl])  # a[pr+1] ~ a[pl-1]

    print('피벗 이상인 그룹입니다.')
    print(*a[pr + 1:n])  # a[pr+1] ~ a[n-1]


if __name__ == '__main__':
    print('배열을 나눕니다.')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}]: '))

    partition(x)  # 배열 x를 나누어서 출력
