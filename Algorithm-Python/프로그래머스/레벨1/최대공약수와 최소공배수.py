def gcd(x: int, y: int) -> int:
    if y == 0:
        return x
    else:
        return gcd(y, x % y)


def solution(n, m):
    answer = []
    answer.append(gcd(n, m))
    answer.append(n // answer[0] * m // answer[0] * answer[0])
    return answer
