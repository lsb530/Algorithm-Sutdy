# 5 8 3(갯수, 몇개를 더할건지, 연속가능숫자)
# 2 4 5 4 6(리스트배열)

def solution():
    # N, M, K를 공백으로 구분하여 입력받기
    n, m, k = map(int, input().split())
    data = list(map(int, input().split()))
    data.sort()  # 정렬
    first = data[n - 1]  # 가장 큰 수
    second = data[n - 2]  # 두 번째로 큰 수
    result = 0
    while True:
        for i in range(k):  # 가장 큰 수를 K번 더하기
            if m == 0:  # m이 0이라면 반복문 탈출
                break
            result += first
            m -= 1  # 더할 때마다 1씩 빼기
        if m == 0:  # m이 0이라면 반복문 탈출
            break
        result += second  # 두 번째로 큰 수를 한 번 더하기
        m -= 1  # 더할 때마다 1씩 빼기
    print(result)


solution()
