finding_target = 2
finding_numbers = [0, 3, 5, 6, 1, 2, 4]

def is_exist_target_number_binary(target, array):
    sorted_array = sorted(array)

    current_min = sorted_array[0]
    current_max = len(sorted_array) - 1
    current_guess = (current_min + current_max) // 2

    find_count = 0

    while current_min <= current_max:
        find_count += 1
        if sorted_array[current_guess] == target:
            print(find_count)
            return True
        elif sorted_array[current_guess] < target:
            current_min = current_guess + 1
        else:
            current_max = current_max - 1
        current_guess = (current_min + current_max) // 2

    return False

result = is_exist_target_number_binary(finding_target, finding_numbers)
print(result)