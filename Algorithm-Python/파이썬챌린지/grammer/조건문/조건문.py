x = 15
if x >= 10:
    print(x)

score = 85
if score >= 90:
    print("학점: A")
elif score >= 80:
    print("학점: B")
elif score >= 70:
    print("학점: C")
else:
    print("학점 F")

# 같은 줄에 있는 코드는 전부 실행된다.
score = 85
if score >= 70:
    print('성적이 70점 이상입니다.')
    if score >= 90:
        print('우수한 성적입니다.')

else:
    print('성적이 70점 미만입니다.')
    print('조금 더 분발하세요.')

print('프로그램을 종료합니다.')
