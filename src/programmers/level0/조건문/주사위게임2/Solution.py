def solution(a, b, c):
    sum = a + b + c
    squareSum = a ** 2 + b ** 2 + c ** 2
    cubeSum = a ** 3 + b ** 3 + c ** 3
    if a != b and b != c and c != a:
        return sum
    elif a == b and b == c and c == a:
        return sum * squareSum * cubeSum
    else:
        return sum * squareSum