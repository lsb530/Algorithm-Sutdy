"""
# 피벗 선택하기
방법1: 나누어야 할 배열의 원소 수가 3 이상이면, 배열에서 임의의 원소 3개를 꺼내 중앙값인 원소를 피벗으로 선택
방법2: 나누어야 할 배열의 맨 앞 원소, 가운데 원소, 맨 끝 원소를 정렬한 뒤 가운데 원소와 맨 끝에서 두 번째 원소를 교환한다.
       맨 끝에서 두 번째 원소값 a[right-1]이 피벗으로 선택되었고, 그 동시에 나눌 대상을 a[left+1]~a[right-2]로 좁힌다.

=> 퀵 정렬은 배열을 조금씩 나누어 보다 작은 문제를 푸는 과정을 반복하므로 시간 복잡도는 O(nlogn)이다.
   그런데 정렬하는 배열의 초깃ㄱ밧이나 피벗을 선택하는 방법에 따라 실행 시간 복잡도가 증가하는 경우도 있다.
   예를 들어 매번 1개의 원소와 나머지 원소로 나누어진다면 n번의 분할이 필요하다. 이러한 최악의 경우
   시간복잡도는 O(n^2)이 된다.
   퀵 정렬은 원소 수가 적은 경우에는 그다지 빠른 알고리즘이 아닌 것으로 알려져 있다.
   그래서 다음 2가지 방법을 적용하여 quick_sort2 프로그램을 작성했다.
   - 원소 수가 9개 미만인 경우 단순 삽입 정렬로 전환합니다.
   - 피벗 선택은 방법 2를 채택한다.
"""
# 퀵 정렬 알고리즘 구현하기(원소 수가 9 미만이면 단순 삽입 정렬)

from typing import MutableSequence


def sort3(a: MutableSequence, idx1: int, idx2: int, idx3: int):
    """a[idx1], a[idx2], a[idx3]을 오름차순으로 정렬하고 중앙값의 인덱스를 반환"""
    if a[idx2] < a[idx1]: a[idx2], a[idx1] = a[idx1], a[idx2]
    if a[idx3] < a[idx2]: a[idx3], a[idx2] = a[idx2], a[idx3]
    if a[idx2] < a[idx1]: a[idx2], a[idx1] = a[idx1], a[idx2]
    return idx2


def insertion_sort(a: MutableSequence, left: int, right: int) -> None:
    """a[left] ~ a[right]를 단순 삽입 정렬"""
    for i in range(left + 1, right + 1):
        j = i
        tmp = a[i]
        while j > 0 and a[j - 1] > tmp:
            a[j] = a[j - 1]
            j -= 1
        a[j] = tmp


def qsort(a: MutableSequence, left: int, right: int) -> None:
    """a[left] ~ a[right]를 퀵 정렬"""
    if right - left < 9:  # 원소 수가 9 미만이면 단순 삽입 정렬로 전환
        insertion_sort(a, left, right)
    else:
        pl = left
        pr = right
        m = sort3(a, pl, (pl + pr) // 2, pr)
        x = a[m]

        a[m], a[pr - 1] = a[pr - 1], a[m]
        pl += 1
        pr -= 2
        while pl <= pr:
            while a[pl] < x: pl += 1
            while a[pr] > x: pr -= 1
            if pl <= pr:
                a[pl], a[pr] = a[pr], a[pl]
                pl += 1
                pr -= 1

        if left < pr: qsort(a, left, pr)
        if pl < right: qsort(a, pl, right)


def quick_sort(a: MutableSequence) -> None:
    """퀵 정렬"""
    qsort(a, 0, len(a) - 1)


if __name__ == '__main__':
    print('퀵 정렬을 합니다(원소 수가 9미만이면 단순 삽입 정렬을 합니다).')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}]: '))

    quick_sort(x)  # 배열 x를 퀵 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
