# 셸 정렬 알고리즘 구현하기(h * 3 + 1의 수열 사용)
"""
h값이 서로 배수가 되지 않도록 만듦. 그러면 원소가 충분히 뒤섞이므로 효율 좋은 정렬을 기대할 수 있다.
이 수열을 거꾸로 살펴보면 1부터 시작하여 3배한 값에 1을 더하고 있다. 하지만 h의 초깃값이 지나치게 크면 효과가 없다.
따라서 배열의 원소 수인 n을 9로 나누었을 때 그 몫을 넘지 않도록 정해야 한다.
셸 정렬의 시간복잡도는 O(n^1.25)이고 단순 정렬의 시간 복잡도인 O(n^2)보다 매우 빠르다.
그러나 셸 정렬 알고리즘은 이웃하지 않고 떨어져 있는 원소를 서로 교환하므로 안정적이지 않다.
"""

from typing import MutableSequence


def shell_sort(a: MutableSequence) -> None:
    """셸 정렬"""
    n = len(a)
    h = 1

    while h < n // 9:  # 9개 이하일 경우는 h가 1로, 단순삽입정렬을 수행하게된다.
        h = h * 3 + 1

    while h > 0:
        for i in range(h, n):  # 여기부터는 단순 삽입정렬 하지만 다른점은 주목하는 원소와 비교하는 원소가 이웃하지않고
            j = i - h  # h개만큼 떨어져 있다! while문을 반복할때마다 h는 3씩 나눠진다.
            tmp = a[i]
            while j >= 0 and a[j] > tmp:
                a[j + h] = a[j]
                j -= h
            a[j + h] = tmp
        h = h // 3


if __name__ == '__main__':
    print('셸 정렬을 수행합니다.')
    num = int(input('원소 수를 입력하세요.: '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}]: '))

    shell_sort(x)  # 배열 x를 셸 정렬

    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
