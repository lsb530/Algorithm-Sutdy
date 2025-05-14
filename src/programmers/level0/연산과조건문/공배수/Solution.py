def solution(number, n, m) -> int:
    if number % n == 0 and number % m == 0:
        return 1
    else:
        return 0