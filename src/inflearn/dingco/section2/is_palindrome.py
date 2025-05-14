input = "abcba"


def is_palindrome(string):
    n = len(string)
    for i in range(n):
        if string[i] != string[n - 1 - i]:
            return False
    return True


def is_palindrome_recursive(string):
    if len(string) <= 1:
        return True
    elif string[0] != string[-1]:
        return False
    return is_palindrome_recursive(string[1:-1])  # 맨 앞과 맨 뒤를 뺀 중간


print(is_palindrome(input))
print(is_palindrome_recursive(input))
