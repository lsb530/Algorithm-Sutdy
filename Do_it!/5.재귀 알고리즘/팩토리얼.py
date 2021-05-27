#   양의 정수 n의 팩토리얼 구하기
#   팩토리얼은 재귀 함수로 정의하지 않는 것이 오히려 더 간단하고 효율적이다.
#   파이썬은 math 모듈에서 math.factorial(x)함수를 제공한다.
"""
팩토리얼 n!의 정의(n은 양의정수)
0! = 1
n>0이면 n! = n * (n -1)!
"""
import math


def factorial(n: int) -> int:
    """양의 정수 n의 팩토리얼을 재귀적으로 구함"""
    if n > 0:
        return n * factorial(n - 1)
    else:
        return 1


if __name__ == '__main__':
    n = int(input('출력할 팩토리를 입력하세요 : '))
    print(f'{n}의 팩토리얼은 {factorial(n)}입니다.')
    print('-' * 4 + ' math 모듈 사용 ' + '-' * 4)
    m = int(input('출력할 팩토리를 입력하세요 : '))
    print(f'{m}의 팩토리얼은 {math.factorial(m)}입니다.')
