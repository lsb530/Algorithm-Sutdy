def solution(n):
    return (pow(n, 0.5) + 1) ** 2 if pow(n, 0.5) == int(pow(n, 0.5)) else -1
