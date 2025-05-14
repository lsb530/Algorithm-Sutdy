def binary_serach(list, item):
    low = 0
    high = len(list) - 1

    while low <= high:
        mid = (low + high) // 2
        guess = list[mid]
        # 아이템을 찾은경우
        if guess == item:
            return mid
        # 추측한 숫자가 너무 큰 경우=>최대치를 낮춘다
        if guess > item:
            high = mid - 1
        # 추측한 숫자가 너무 작은 경우=>최소치를 높인다
        else:
            low = mid + 1
    # 아이템이 없는 경우
    return None


my_list = [1, 3, 5, 7, 9]
print(binary_serach(my_list, 3))
print(binary_serach(my_list, 10))
