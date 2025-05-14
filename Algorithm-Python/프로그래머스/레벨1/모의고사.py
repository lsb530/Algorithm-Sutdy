def solution(answers):
    MAX_Q = 10000
    p1 = [[1, 2, 3, 4, 5, ] for i in range(MAX_Q)]
    # p1 = [1, 2, 3, 4, 5, ] * MAX_Q
    # p2 = [2, 1, 2, 3, 2, 4, 2, 5,] * MAX_Q
    p2 = [[2, 1, 2, 3, 2, 4, 2, 5, ] for i in range(MAX_Q)]
    # p2 = [1, 2, 3, 4, 5, ] * MAX_Q
    # p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ] * MAX_Q
    p3 = [[3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ] for i in range(MAX_Q)]
    print(len(p1), len(p2), len(p3))
    re1 = 0
    re2 = 0
    re3 = 0
    result = []
    answer = answers * MAX_Q
    for i in range(MAX_Q):
        if p1[i] == answer[i]:
            re1 += 1
        if p2[i] == answer[i]:
            re2 += 1
        if p3[i] == answer[i]:
            re3 += 1
    result.append(re1)
    result.append(re2)
    result.append(re3)
    # result = sorted(result)
    print(result)
    # print(max(result))
    MAX = max(result)
    rresult = []
    for i, v in enumerate(result):
        if v == MAX:
            rresult.append(i + 1)
    print(rresult)
    return sorted(rresult)
    # print(result.index(max(result)))
    # return result


answers1 = [1, 2, 3, 4, 5]
answers2 = [1, 3, 2, 4, 2]
solution(answers1)
solution(answers2)
