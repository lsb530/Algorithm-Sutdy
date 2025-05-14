numbers = [1, 1, 1, 1, 1]
target_number = 3

def get_count_of_ways_to_target_by_doing_plus_or_minus(array, target):
    result = []

    def get_all_ways_by_doing_plus_or_minus(array, idx, sum):
        if idx == len(array):
            result.append(sum)
            return
        # print(idx, sum)
        get_all_ways_by_doing_plus_or_minus(array, idx + 1, sum + array[idx])
        get_all_ways_by_doing_plus_or_minus(array, idx + 1, sum - array[idx])

    get_all_ways_by_doing_plus_or_minus(array, 0, 0)
    # print("result is", result)

    answer = 0
    for x in result:
        if x == target:
            answer += 1
    return answer

print(get_count_of_ways_to_target_by_doing_plus_or_minus(numbers, target_number))  # 5를 반환해야 합니다!

