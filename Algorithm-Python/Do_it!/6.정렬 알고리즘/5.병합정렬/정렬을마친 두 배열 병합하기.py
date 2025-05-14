"""
 a
[2   4   6   8   11  13]
 b
[1   2   3   4   9   16  21]
 c
[1   2   2   3   4   4   6   8   9   11  13  16  21]
각 배열에서 주목하는 원소의 값을 비교하여 작은 쪽의 원소를 꺼내 새로운 배열에 저장한다.
이 작업을 반복하여 정렬을 마친 배열을 만든다.
merge() 함수는 원소 수가 na인 배열 a와 nb인 배열 b를 병합하여 배열 c에 저장한다.
위에서 배열 a, b, c를 스캔할 때 주목하는 원소의 인덱스는 각각 pa, pb, pc이다.
지금부터 이 인덱스를 저장한 변수를 커서라고 한다. 처음에는 맨 앞 원소에 주목하므로 모두 0으로 초기화한다.
이 예제는 3개의 반복문을 늘어놓는 단순한 병합 알고리즘이다. 병합하는데 필요한 시간 복잡도는 O(n)이다.
"""
# 정렬을 마친 두 배열을 병합하기

from typing import MutableSequence, Sequence


def merge_sorted_list(a: Sequence, b: Sequence, c: MutableSequence) -> None:
    """정렬을 마친 배열 a와b를 병합하여 c에 저장"""
    pa, pb, pc = 0, 0, 0  # 각 배열의 커서
    na, nb, bc = len(a), len(b), len(c)  # 각 배열의 원소 수

    while pa < na and pb < nb:  # pa와 pb를 비교하여 작은 값을 pc에 저장
        if a[pa] <= b[pb]:
            c[pc] = a[pa]
            pa += 1
        else:
            c[pc] = b[pb]
            pb += 1
        pc += 1

    while pa < na:  # a에 남은 원소를 c에 복사
        c[pc] = a[pa]
        pa += 1
        pc += 1
    while pb < nb:  # b에 남은 원소를 c에 복사
        c[pc] = b[pb]
        pb += 1
        pc += 1


if __name__ == '__main__':
    a = [2, 4, 6, 8, 11, 13]
    b = [1, 2, 3, 4, 9, 16, 21]
    c = [None] * (len(a) + len(b))
    print('정렬을 마친 두 배열의 병합을 수행합니다.')

    merge_sorted_list(a, b, c)  # 배열 a와 b를 병합하여 c에 저장
    print('배열 a와 b를 병합하여 배열 c에 저장했습니다.')
    print(f'배열 a: {a}')
    print(f'배열 b: {b}')
    print(f'배열 c: {c}')
