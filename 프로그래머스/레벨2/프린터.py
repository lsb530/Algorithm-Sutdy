def solution(priorities, location):
    # prioriteis 중 가장 큰 숫자를 찾아서 뺀다.
    # 그 위치의 값을 저장한 후 그 이후 인덱스부터 최대값을 찾는다. 그리고 그 값을 뺀다
    # 리스트의 끝에 도착했으면 맨 처음부터 priorites(index)의 n-1까지 앞의 함수를 반복한다
    # pop할때마다 숫자를 더해서 최종 그 값을 리턴(순서)
    array1 = [c for c in range(len(priorities))]  # index 위치 저장
    array2 = priorities.copy()  # 값 저장 (출력되는 값)
    print(array1)
    print(array2)
    i = 0
    while True:
        if array2[i] < max(array2[i + 1:]):
            array1.append(array1.pop(i))
            array2.append(array2.pop(i))
        else:
            i += 1
        if array2 == sorted(array2, reverse=True):
            break
    return array1.index(location) + 1


priorities1 = [2, 1, 3, 2]
location1 = 2
priorities2 = [1, 1, 9, 1, 1, 1]
location2 = 0

print(solution(priorities1, location1))
print(solution(priorities2, location2))
