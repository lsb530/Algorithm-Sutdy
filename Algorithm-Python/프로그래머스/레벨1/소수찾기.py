# n은 2이상 1000000이하의 자연수입니다.
def solution(n):
    answer = 1  # 2를 소수로 침
    prime = []
    for i in range(3, n + 1, 2):  # 3부터 홀수만 검색
        print(f'<i = {i}>')
        for j in range(2, i):
            print(f'j={j}', end=' ')
            print(f'i%j = {i % j}')
            if (i % j) == 0:
                break
        else:  # break가 없을 경우!
            print('쁑', i)
            answer += 1
    return answer


print(solution(10))
