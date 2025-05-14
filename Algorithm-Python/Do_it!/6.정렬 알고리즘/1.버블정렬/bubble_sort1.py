# 버블 정렬 알고리즘 구현하기
# 시간복잡도 : O(n^2)
"""
i값을 0부터 n-2까지 1씩 증가시키고, 패스를 n-1번 수행한다
원소를 비교하는 횟수는 첫펀째 패스에서는 n-1번, 두번재는 n-2, ... 이므로 합계는
(n-1) + (n-2) + ... + 1 = n(n-1)/2
하지만 실제 원소를 교환하는 횟수는 배열의 원솟값에 따라 영향을 받으므로 그 평균값은 비교 횟수 전체의 절반인
n(n-1)/4번이다.
"""
"""
버블 정렬은 1칸 이상 떨어져 있는 원소를 교환하는 것이 아니라 서로 이웃한 원소만 교환하므로 안정적이다.
"""
from typing import MutableSequence


def bubble_sort(a: MutableSequence) -> None:
    """버블 정렬"""
    n = len(a)
    for i in range(n - 1):
        for j in range(n - 1, i, -1):  # 패스-뒤에서 가야하므로 n-1부터 i까지 -1(역순)
            if a[j - 1] > a[j]:  # 앞쪽원소가 더 크면
                a[j - 1], a[j] = a[j], a[j - 1]  # 교환


if __name__ == '__main__':
    print('버블 정렬을 수행합니다.')
    num = int(input('원소 수를 입력하세요 : '))
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}]: '))

    bubble_sort(x)  # 배열 x를 버블 정렬
    print('오름차순으로 정렬했습니다.')
    for i in range(num):
        print(f'x[{i}] = {x[i]}')
