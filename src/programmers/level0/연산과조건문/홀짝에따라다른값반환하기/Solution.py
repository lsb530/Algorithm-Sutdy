def solution(n):
    answer = 0
    isEven = n % 2 == 0
    start = 2 if isEven else 1
    for i in range(start, n + 1, 2):
        answer += i * i if isEven else i
    return answer

# simple
# def solution(n):
#     if n%2:
#         return sum(range(1,n+1,2))
#     return sum([i*i for i in range(2,n+1,2)])

print(solution(7))
print(solution(10))