#   1,000 이하의 소수를 나열하기

counter = 0  # 나눗셈 횟수를 카운트
list = []
for n in range(2, 1001):
    for i in range(2, n):
        counter += 1
        if n % i == 0:
            break
    else:
        list.append(n)
        # print(n, end=' ')
print(list)
print(f'나눗셈을 실행한 횟수 : {counter}')
