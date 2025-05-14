def solution(n):
    answer = ''
    while n:
        n, remain = divmod(n, 3)
        answer = "412"[remain] + answer
        if not remain:
            n -= 1
    return answer


print(*divmod(7, 5))

print(solution(10))
