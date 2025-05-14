# 출력시 오류가 발생하는 코드
# answer = 7
# print("정답은 " + answer + "입니다.")

# 수정 코드
answer = 7
print("정답은 " + str(answer) + "입니다.")

# 다른 방법
answer = 7
print("정답은", str(answer), "입니다.")

# Python 3.6 이상
print(f'정답은 {answer}입니다.')
