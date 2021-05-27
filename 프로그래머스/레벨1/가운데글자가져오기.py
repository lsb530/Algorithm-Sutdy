"""단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다."""
a = 'abcde'  # answer = c
b = 'qwer'  # answer = we
c = 'abcdefg'  # answer = d
d = 'qwertyui'  # answer = rt


def solutioned(s):
    answer = ''
    length = len(s)
    if (length % 2) == 1:
        print("홀수")
        print(s[length // 2])
    else:
        print("짝수")
        print(s[length // 2 - 1:length // 2 + 1])
        # print(s[length // 2])
    # if (length % 2) == 1:
    #     mid = length//2+1
    # else:
    #     mid = length//2
    # print(f'길이:{length}, 중앙:{mid}')
    return answer


def solution(s):
    answer = ''
    length = len(s)
    if (length % 2) == 1:
        answer = s[length // 2]
    else:
        answer = s[length // 2 - 1:length // 2 + 1]
    return answer
