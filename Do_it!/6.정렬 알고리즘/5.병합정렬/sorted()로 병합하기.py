# 이 방법은 a와 b가 정렬을 마친 상태가 아니어도 적용할 수 있다는 장점이 있지만, 속도가 빠르지 않다.
# 빠르게 병합하려면 heapq 모듈의 merge() 함수를 사용된다.
# 정렬을 마친 두 배열의 병합(heapq.merge 사용)
import heapq

if __name__ == '__main__':
    a = [2, 4, 6, 8, 11, 13]
    b = [1, 2, 3, 4, 9, 16, 21]
    c = list(sorted(a + b))  # 일반 sorted병합(느림)
    d = list(heapq.merge(a, b))  # heapq 모듈을 이용한 병합(빠름)
    print('정렬을 마친 두 배열의 병합을 수행합니다.')
    print('배열 a와 b를 병합하여 배열 c(느림), d(빠름)에 저장했습니다.')
    print(f'배열 a: {a}')
    print(f'배열 b: {b}')
    print(f'배열 c: {c}')
    print(f'배열 d: {d}')
