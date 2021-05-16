result = 0

# i는 1부터 9까지의 모든 값을 순회
for i in range(1, 10):
    result += i
print(result)

# range()의 값으로 하나의 값만을 넣으면, 자동으로 시작값은 0이된다.
# 주로 리스트나 튜플 데이터의 모든 원소를 첫번째 인덱스부터 방문해야 할 때 이 방법을 사용한다.
scores = [90, 85, 77, 65, 97]
for i in range(5):
    if scores[i] >= 80:
        print(i + 1, "번 학생은 합격입니다.")
