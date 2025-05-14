# 가로, 세로 길이가 정수이고 넓이가 area인 직사각형에서 변의 길이 나열하기

area = int(input('직사각형의 넓이를 입력하세요 : '))

for i in range(1, area + 1):  # 1부터 32까지
    if i * i > area: break
    if area % i:  # area가 i로 나누어 떨어지지 않으면 밑에 실행하지않고 다음 반복문으로 넘어감
        # print(f'area % i 는 {area} % {i} = {area%i}')
        continue
    print(f'{i} x {area // i}')
