"""
문제 설명
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
"""
"""
제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 
이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
"""
# n	lost	reserve	    return
# 5	[2, 4]	[1, 3, 5]	5
# 5	[2, 4]	[3]	        4
# 3	[3]	    [1]	        2

# 입출력 예 설명
# 예제 #1
# 1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.

# 예제 #2
# 3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
n1 = 5
lost1 = [2, 4]
reserve1 = [1, 3, 5]
n2 = 5
lost2 = [2, 4]
reserve2 = [3]
n3 = 3
lost3 = [3]
reserve3 = [1]


def solutioned(n, lost, reserve):
    answer = 0
    all = []
    available = []  # 중요 리스트
    ck = []
    for i in range(1, n + 1):
        all.append(i)
        available.append(1)
        ck.append(True)
    for x in lost:
        available[x - 1] -= 1
    for y in reserve:
        available[y - 1] += 1  # 2개를 가진거를 표현
    print('-' * 5 + '빌리기전' + '-' * 5)
    print(all)
    print(available)
    print(ck)
    for j in range(len(available)):
        if available[j] == 0:
            if j > 0 and available[j - 1] > 1 and ck[j - 1] is True:
                available[j] += 1
                available[j - 1] -= 1
                ck[j - 1] = False
            elif j < len(available) - 1 and available[j + 1] > 1 and ck[j + 1] is True:
                available[j] += 1
                available[j + 1] -= 1
                ck[j + 1] = False
        else:
            print(available[j])
    for k in available:
        if k > 0:
            answer += 1
    print('-' * 5 + '빌린 후' + '-' * 5)
    print(all)
    print(available)
    print(ck)
    print(f'체육복을 빌릴 수 있는 학생의 수 : {answer}')
    return answer


solutioned(n1, lost1, reserve1)
solutioned(n2, lost2, reserve2)
solutioned(n3, lost3, reserve3)


def solution(n, lost, reserve):
    answer = 0
    all = []
    available = []
    ck = []
    for i in range(1, n + 1):
        all.append(i)
        available.append(1)
        ck.append(True)
    for x in lost:
        available[x - 1] -= 1
    for y in reserve:
        available[y - 1] += 1
    for j in range(len(available)):
        if available[j] == 0:
            if j > 0 and available[j - 1] > 1 and ck[j - 1] is True:
                available[j] += 1
                available[j - 1] -= 1
                ck[j - 1] = False
            elif j < len(available) - 1 and available[j + 1] > 1 and ck[j + 1] is True:
                available[j] += 1
                available[j + 1] -= 1
                ck[j + 1] = False
    for k in available:
        if k > 0:
            answer += 1
    return answer
