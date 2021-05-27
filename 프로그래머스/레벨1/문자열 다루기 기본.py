a = 'a234'
b = '1234'


def solution(s):
    answer = False
    if len(s) == 4 or len(s) == 6:
        try:
            int(s)
        except:
            answer = False
        else:
            answer = True
    print(answer)
    return answer


solution(a)
solution(b)
