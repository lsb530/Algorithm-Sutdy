def solution(x):
    sum = 0
    t = x
    while True:
        if x == 0:
            break
        sum += x % 10
        x = x // 10
    return True if (t % sum) == 0 else False


solution(103)
print()
solution(1215)
print()
solution(1157)
print()
solution(1353)
