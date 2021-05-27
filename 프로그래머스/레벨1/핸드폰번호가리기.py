def solution(phone_number):
    answer = ''
    for i in phone_number[:-4]:
        answer += '*'
    answer += phone_number[-4:]
    return answer


phone_number1 = "01033334444"
phone_number2 = "027778888"

solution(phone_number1)
solution(phone_number2)

# phone_number	return
# 01033334444	*******4444
# 027778888	*****8888
