# lottos = [44, 1, 0, 0, 31, 25]
# lottos = [0, 0, 0, 0, 0, 0]
lottos = [45, 4, 35, 20, 3, 9]
# win_nums = [31, 10, 45, 1, 6, 19]
# win_nums = [38, 19, 20, 40, 15, 25]
win_nums = [45, 4, 35, 20, 3, 9]

def solution(lottos, win_nums):
    answer = []
    resultMap = {}
    resultMap["2"] = 5
    resultMap["3"] = 4
    resultMap["4"] = 3
    resultMap["5"] = 2
    resultMap["6"] = 1
    max = len(list(filter(lambda x: x in win_nums, lottos))) # 0 다 안맞음. 6은 전부 다 일치
    min = len(list(filter(lambda x: x == 0, lottos)))
    print(max, min)
    lst = [int(min), int(min+max)]
    answer.append(resultMap.get(str(lst[0])))
    # answer.append(resultMap.get(str(lst[1])))
    # answer.sort()
    print(answer)
    return answer

if __name__ == '__main__':
    k = (lambda x,y: x + y)(10, 20)
    t = list(map(lambda x: x ** 2, range(5)))
    m = list(filter(lambda x: x < 5, range(10)))
    solution(lottos, win_nums)