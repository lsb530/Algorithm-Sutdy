seat_count = 9
vip_seat_array = [4, 7]


#   Q. 4, 7이 고정 좌석일때 123 56 89를 마음대로 옮길 수 있는 경우의 수
# 1. 숫자를 써보면서 발견
# [1] -> [1] => 1개
# [1, 2] -> [1, 2] [2, 1] => 2개
# [1, 2, 3] -> [1, 2, 3] [1, 3, 2] [2, 1, 3] => 3개
# [1, 2, 3, 4] -> [1, 2, 3, 4] [2, 1, 3, 4] [1, 3, 2, 4] [1, 2, 4, 3] [1, 3, 4, 2] => 5개
# => 피보나치 수열

# 2. 점화식을 통해 파악
# 1 2 3 .. n -2 / n -1 / n
# F(N) = F(N-1) + F(N-2)

# f(3) * f(2) * f(2) = 3 * 2 * 2(곱의 법칙)
#  123 4  56  7  89
def get_all_ways_of_theater_seat(total_count, fixed_seat_array):
    memo = {
        1: 1,
        2: 2
    }

    all_ways = 1
    current_index = 0

    for fixed_seat in fixed_seat_array:
        fixed_seat_index = fixed_seat - 1
        count_of_ways = fibo_dynamic_programming(fixed_seat_index - current_index, memo)
        # print('count_of_ways', count_of_ways)
        all_ways *= count_of_ways
        current_index = fixed_seat_index + 1
        # print('current_index', current_index)

    count_of_ways = fibo_dynamic_programming(total_count - current_index, memo)
    all_ways *= count_of_ways

    return all_ways


def fibo_dynamic_programming(n, fibo_memo):
    if n in fibo_memo:
        return fibo_memo[n]

    nth_fibo = fibo_dynamic_programming(n - 1, fibo_memo) + fibo_dynamic_programming(n - 2, fibo_memo)
    fibo_memo[n] = nth_fibo

    return nth_fibo


print("정답 = 12 / 현재 풀이 값 = ", get_all_ways_of_theater_seat(seat_count, vip_seat_array))
print("정답 = 4 / 현재 풀이 값 = ", get_all_ways_of_theater_seat(9, [2, 4, 7]))
print("정답 = 26 / 현재 풀이 값 = ", get_all_ways_of_theater_seat(11, [2, 5]))
print("정답 = 6 / 현재 풀이 값 = ", get_all_ways_of_theater_seat(10, [2, 6, 9]))
