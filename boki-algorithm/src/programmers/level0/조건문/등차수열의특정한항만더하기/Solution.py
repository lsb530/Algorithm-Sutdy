def solution(a, d, included):
    x = (a + i * d for i, include in enumerate(included) if include)
    print(*x)
    return sum(a + i * d for i, include in enumerate(included) if include)
    # return answer

x = solution(3, 4, [True, False, False, True, True])
print(x)