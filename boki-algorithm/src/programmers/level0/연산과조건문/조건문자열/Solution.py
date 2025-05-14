def solution(ineq, eq, n, m):
    operations = {
        '>=': lambda n, m: 1 if n >= m else 0,
        '>!': lambda n, m: 1 if n > m else 0,
        '<=': lambda n, m: 1 if n <= m else 0,
        '<!': lambda n, m: 1 if n < m else 0
    }
    return operations[ineq + eq](n, m)

print(solution("<", "=", 20, 50))
print(solution(">", "!", 41, 78))