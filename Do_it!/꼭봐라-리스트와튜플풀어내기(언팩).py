# 리스트와 튜플 풀어내기
"""
좌변에는 여러 개의 변수를 놓고 우변에는 리스트나 튜플을 놓으면, 우변의 원소를 좌변의 변수에 한번에 대입할 수 있습니다.
이와 같이 리스트나 튜플의 원솟값들을 풀어 여러 변수에 대입하는 것을 언팩(unpack)이라고 합니다.
"""
x = [1, 2, 3]  # 리스트 x 선언
a, b, c = x  # x를 언팩하여 변수 a, b, c에 대입
print(a, b, c)

if x:  # x가 비어 있지 않으면(True) 실행
    print('Not empty')
else:  # x가 비어있으면(False) 실행
    print('Empty')

""" 내포 표기 생성
리스트 안에서 for, if 문을 사용하여 새로운 리스트를 생성하는 기법을 내포 표기 생성이라고 한다.
다음은 numbers 리스트의 원솟값이 홀수인 경우에 그 원소에*2를 하여 새 리스트(twise)를 생성한 예제이다.
"""
numbers = [1, 2, 3, 4, 5]
twise = [num * 2 for num in numbers if num % 2 == 1]
print(twise)
