# arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
# arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
"""
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
"""


# chk_arr = [[0, 0], [1, 0], [2, 0], [3, 0], [4, 0], [5, 0], [6, 0], [7, 0], [8, 0], [9, 0]]
def wrong_solution(arr):
    chk_arr = [[0, 0], [1, 0], [2, 0], [3, 0], [4, 0], [5, 0], [6, 0], [7, 0], [8, 0], [9, 0]]
    answer = []
    for i in range(len(arr)):
        x = arr[i]  # 1 1 3 3 0 1 1
        for j in range(len(chk_arr)):
            if x == chk_arr[j][0]:
                chk_arr[j][1] += 1
            # print(f'i : {i}, j: {j} : {chk_arr[j][0]}')
        # print()
        # print(f'arr[{i}] : {arr[i]}')
    for a, b in chk_arr:
        print(a, b)
        if b >= 1:
            answer.append(a)
    print(answer)
    return answer


arr = [1, 1, 3, 3, 0, 1, 1]


def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in arr[1:]:
        top = answer[-1]
        if i == top:
            continue
        answer.append(i)
    return answer


print(solution(arr))
