"""
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
solution을 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
"""
a = 5
b = 24


# result = "TUE"
def solutioned(a, b):
    answer = ''
    total = 0
    mon = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    # 2월은 윤년에 따라 윤년:29일 평년:28일
    # 8월(31일)이후부터는 짝수가 31일, 홀수가 30일
    day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for i in range(a - 1):
        total += day[i]
    # print(f'total:{total}')
    total += b - 1  # 배열의 첫번째를 선택하게하려고
    # print(f'total:{total}')
    answer = mon[total % 7]
    print(answer)
    return answer


solutioned(1, 1)
solutioned(a, b)


def solution(a, b):
    answer = ''
    total = 0
    mon = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    day = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for i in range(a - 1):
        total += day[i]
    total += b - 1
    answer = mon[total % 7]
    return answer
