# 투 포인터 알고리즘(Two Pointer Algorithm)
# 리스트에 순차적으로 접근해야 할 때 2개의 점의 위치를 기록하면서 처리하는 알고리즘
# 리스트 내 원소에 음수값이 있다면 투 포인터 알고리즘으로 해결 X
n = 5  # 데이터의 개수 N
m = 5  # 찾고자 하는 부분합 M
data = [1, 2, 3, 2, 5]  # 전체 수열

count = 0
interval_sum = 0
end = 0

# start 차례대로 증가시키며 반복
for start in range(n):
    # end 가능한 만큼 이동시키기
    while interval_sum < m and end < n:
        interval_sum += data[end]
        end += 1
    # 부분합이 m일때 카운트 증가
    if interval_sum == m:
        count += 1
    interval_sum -= data[start]

print(count)
