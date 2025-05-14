"""
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
"""
# 1번
# n (10진법)	n (3진법)	앞뒤 반전(3진법)	 10진법으로 표현
# 45	        1200	        0021	        7
# 따라서 7을 return 해야 합니다.
# 2번
# n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
# 125	        11122	        22111	        229
# 따라서 229를 return 해야 합니다.
n = 45
m = 125


def solutioned(n):
    answer = 0
    d = ''  # 변환 후의 문자열
    dchar = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    while n > 0:
        d += dchar[n % 3]  # 해당하는 문자를 꺼내 결합 1
        n //= 3
    # return d[::-1]  # 역순으로 반환
    length = []
    number = []
    for i in range(len(d), 0, -1):
        length.append(i)
    for x in d:
        number.append(int(x))
    full = list(zip(length, number))
    print(full)
    print(d)
    for i in range(len(full)):
        # print(full[i][1], end=' ')
        # print(3 ** full[i][0])
        answer += (full[i][1] * (3 ** (full[i][0] - 1)))
    print(answer)
    # return d[:]     # 앞순으로 반환
    return answer


solutioned(n)


# solutioned(m)

def solution(n):
    answer = 0
    d = ''  # 변환 후의 문자열
    dchar = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    while n > 0:
        d += dchar[n % 3]  # 해당하는 문자를 꺼내 결합 1
        n //= 3
    length = []
    number = []
    for i in range(len(d), 0, -1):
        length.append(i)
    for x in d:
        number.append(int(x))
    full = list(zip(length, number))
    for i in range(len(full)):
        answer += (full[i][1] * (3 ** (full[i][0] - 1)))
    return answer


print(solution(n))
print(solution(m))
