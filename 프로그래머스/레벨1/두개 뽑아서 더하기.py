list1 = [2, 1, 3, 4, 1]
list2 = [5, 0, 2, 7]


def 두개뽑아서더하기(lst):
    result = []
    for x in range(len(lst)):
        for y in range(len(lst)):
            if y == x:
                continue
            result.append(lst[y] + lst[x])
    result = set(result)
    result = list(result)
    result = sorted(result)
    return result


print(두개뽑아서더하기(list1))
print(두개뽑아서더하기(list2))

# result = []
# for x in range(len(list1)):
#     for y in range(len(list1)):
#         if y == x:
#             continue
#         result.append(list1[y] + list1[x])
# result = set(result)
# result = list(result)
# result = sorted(result)
# print(result)

"""제출한 정답"""
# def solution(numbers):
#     answer = []
#     for x in range(len(numbers)):
#         for y in range(len(numbers)):
#             if y == x:
#                 continue
#             answer.append(numbers[y] + numbers[x])
#     answer = set(answer)
#     answer = list(answer)
#     answer = sorted(answer)
#     return answer
