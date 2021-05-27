def solution():
    n = int(input())
    m = int(input())
    i = 0
    result = 0
    arr = []
    # for i in range(0, 3): # 0~2

    while True:
        m %= 10
        print(n * (m % 10))
        result += (n * (m % 10)) * 10 ** i
        m //= 10
        i += 1
    print(result)


solution()
