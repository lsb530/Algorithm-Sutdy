def quicksort(arr):
    if len(arr) < 2:
        return arr  # 기본단계 : 원소의 개수가 0이나 1이면 이미 정렬되어있는 상태
    else:
        pivot = arr[0]  # 재귀단계
        # 기준 원소보다 작거나 같은 모든 원소로 이루어진 하위 배열
        less = [i for i in arr[1:] if i <= pivot]
        # 기준 원소보다 큰 모든 원소로 이루어진 하위 배열
        greater = [i for i in arr[1:] if i > pivot]

        return quicksort(less) + [pivot] + quicksort(greater)


print(quicksort([10, 5, 2, 3, 13, 8, 7]))
