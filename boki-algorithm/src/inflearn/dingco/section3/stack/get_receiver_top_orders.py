top_heights = [6, 9, 5, 7, 4]


# 인덱스
# 0 1 2 3 4
# v v v v
#
# 0 1 2 3 4
# v v v
#
# 0 1 2 3 4
# v v
#
# 0 1 2 3 4
# v
#
# 3210 -> 210 -> 10 -> 0

def print_index(heights):
    for i in range(len(heights) - 1, 0, -1):
        for j in range(i - 1, -1, -1):
            print(i, j)
        print()


# print_index(top_heights)


def get_receiver_top_orders(heights):
    answer = [0] * len(heights)

    for i in range(len(heights) - 1, 0, -1):
        for j in range(i - 1, -1, -1):
            if heights[i] < heights[j]:
                answer[i] = j + 1
                break

    return answer


print("정답 = [0, 0, 2, 2, 4] / 현재 풀이 값 = ", get_receiver_top_orders([6, 9, 5, 7, 4]))
print("정답 = [0, 0, 0, 3, 3, 3, 6] / 현재 풀이 값 = ", get_receiver_top_orders([3, 9, 9, 3, 5, 7, 2]))
print("정답 = [0, 0, 2, 0, 0, 5, 6] / 현재 풀이 값 = ", get_receiver_top_orders([1, 5, 3, 6, 7, 6, 5]))
