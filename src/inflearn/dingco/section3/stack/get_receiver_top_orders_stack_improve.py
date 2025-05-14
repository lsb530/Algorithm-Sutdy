# [6, 9, 5, 7, 4]
def get_receiver_top_orders(heights):
    answer = [0] * len(heights)
    stack = [] # [인덱스, 높이] 저장

    for i in range(len(heights)):
        # top_height = stack[-1][1]
        while stack and stack[-1][1] <= heights[i]:
            stack.pop()
        if stack:
            answer[i] = stack[-1][0] + 1
        stack.append([i, heights[i]])

    # print(stack)
    # print(stack[-2][0], stack[-2][1])

    return answer


print("정답 = [0, 0, 2, 2, 4] / 현재 풀이 값 = ", get_receiver_top_orders([6, 9, 5, 7, 4]))
print("정답 = [0, 0, 0, 3, 3, 3, 6] / 현재 풀이 값 = ", get_receiver_top_orders([3, 9, 9, 3, 5, 7, 2]))
print("정답 = [0, 0, 2, 0, 0, 5, 6] / 현재 풀이 값 = ", get_receiver_top_orders([1, 5, 3, 6, 7, 6, 5]))
