def solution(num):
    answer = 0
    while True:
        if answer > 500:
            answer = -1
            print(answer)
            return answer
        if num == 1:
            print(answer)
            return answer
        if num % 2 == 0:
            num = num // 2
            answer += 1
        else:
            num = num * 3 + 1
            answer += 1


solution(6)
solution(16)
solution(626331)
