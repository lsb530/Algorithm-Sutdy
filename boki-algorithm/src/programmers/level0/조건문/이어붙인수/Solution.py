def solution(num_list):
    evens = ''.join(str(num) for num in num_list if num % 2 == 0)
    odds = ''.join(str(num) for num in num_list if num % 2 != 0)
    return int(evens or '0') + int(odds or '0')