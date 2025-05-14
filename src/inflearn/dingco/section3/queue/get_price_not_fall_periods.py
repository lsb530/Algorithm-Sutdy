prices = [1, 2, 3, 2, 3]


#   v v v
# 0 1 2 3 4

#     v v
# 0 1 2 3 4

#       v
# 0 1 2 3 4

def print_range():
    for i in range(0, 4, 1):
        for j in range(i + 1, 5, 1):
            print(i, j)
        print()


# print_range()


def get_price_not_fall_periods(prices):
    answer = [0] * len(prices)
    n = len(prices)

    for i in range(0, n - 1, 1):
        price_not_fall_days = 0
        for j in range(i + 1, n, 1):
            if prices[i] <= prices[j]:
                price_not_fall_days += 1
            else:
                price_not_fall_days += 1  # 가격이 떨어지는 순간에도 1초간 유지한걸로 치겠다
                break
        answer[i] = price_not_fall_days

    return answer


print("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = ", get_price_not_fall_periods([1, 2, 3, 2, 3]))
print("정답 = [6, 2, 1, 3, 2, 1, 0] / 현재 풀이 값 = ", get_price_not_fall_periods([3, 9, 9, 3, 5, 7, 2]))
print("정답 = [6, 1, 4, 3, 1, 1, 0] / 현재 풀이 값 = ", get_price_not_fall_periods([1, 5, 3, 6, 7, 6, 5]))
