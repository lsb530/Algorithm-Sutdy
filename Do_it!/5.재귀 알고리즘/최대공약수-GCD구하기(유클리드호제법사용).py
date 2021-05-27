#   유클리드 호제법으로 최대 공약수 구하기
#   파이썬은 math 모듈에서 math.gcd(a, b)함수를 제공한다.
"""
최대 공약수 : GCD(Greatest Common Divisor)
문제예시 : 직사각형 안을 정사각형 여러 개로 가득 채워 나갑니다. 이렇게 만들 수 있는 정사각형 가운데 가장 작은
            정사각형의 변의 길이를 구하시오.
[유클리드 호제법 알고리즘]
- y가 0이면 ... x
- y가 0이 아니면 gcd(y, x%y)
"""
import math


def gcd(x: int, y: int) -> int:
    """정숫값 x와 y의 최대 공약수를 반환"""
    if y == 0:
        return x
    else:
        return gcd(y, x % y)


if __name__ == '__main__':
    print('두 정숫값의 최대 공약수를 구합니다.')
    x = int(input('첫 번째 정숫값을 입력하세요 : '))
    y = int(input('두 번째 정숫값을 입력하세요 : '))
    print(f'두 정숫값의 최대 공약수는 {gcd(x, y)}입니다.')
    print('-' * 4 + ' math 모듈 사용 ' + '-' * 4)
    print('두 정숫값의 최대 공약수를 구합니다.')
    a = int(input('첫 번째 정숫값을 입력하세요 : '))
    b = int(input('두 번째 정숫값을 입력하세요 : '))
    print(f'두 정숫값의 최대 공약수는 {math.gcd(a, b)}입니다.')
