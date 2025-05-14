#   2자리 양수(10~99) 입력받기

print('2자리 양수를 입력하세요.')

while True:
    no = int(input('값을 입력하세요 : '))
    #   기본
    # if no >= 10 and no <= 99:
    #     break
    #   비교 연산자를 연속으로 사용하는 방법
    # if 10 <= no <= 99:
    #     break
    #   드모르간 법칙을 사용한 방법
    if not (no < 10 or no > 99):  # no>=10 and no<=99 와 같다
        break

print(f'입력받은 양수는 {no}입니다.')
