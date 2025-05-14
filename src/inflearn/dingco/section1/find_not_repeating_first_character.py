def find_not_repeating_first_character(string):
    # string에서 알파벳의 빈도수를 찾는다
    # 그리고 빈도수가 1인 알파벳들 중에서 먼저 나온 알파벳을 찾는다
    occurrence_array = find_max_occurred_alphabet(string)
    for s in string:
        index = ord(s) - ord('a')
        if occurrence_array[index] != 0 and occurrence_array[index] == 1:
            return s
    return "_"

def find_max_occurred_alphabet(string):
    alphabet_occurrence_array = [0] * 26
    for char in string:
        if not char.isalpha():
            continue
        arr_index = ord(char) - ord('a')
        alphabet_occurrence_array[arr_index] += 1

    return alphabet_occurrence_array


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 = _ 현재 풀이 값 =", result("aaaaaaaa"))