# arr = [1, 2, 2, 3, 3, 3]
# set(arr)
# print(set(arr))

# 근사 알고리즘=>NP완전문제(집합 커버링 문제<set-covering problem>)을 풀기 위해 사용
# 1. 방송하고자 하는 주(state)들의 목록(set 사용)
states_needed = set(["mt", "wa", "or", "id", "nv", "ut", "ca", "az"])  # 배열을 넣으면 집합이 된다 (집합은 중복된 원소를 가지지 않는다)
# 2. 선택된 방송국의 목록도 필요하다(해시 테이블 사용)
stations = {}
stations["kone"] = set(["id", "nv", "ut"])
stations["ktwo"] = set(["wa", "id", "mt"])
stations["kthree"] = set(["or", "nv", "ca"])
stations["kfour"] = set(["nv", "ut"])
stations["kfive"] = set(["ca", "az"])
# 3. 방문할 방송국의 목록을 저장할 집합
final_stations = set()
# 모든 방송국을 하나씩 보면서 아직 방송이 되지 않는 주 중에서 가장 많은 주를 커버하고 있는 방송국을 고른다
while states_needed:
    best_station = None
    states_covered = set()  # 아직 방송되지 않은 주 중에서 해당 방송국이 커버하는 주의 집합
    for station, states_for_station in stations.items():
        covered = states_needed & states_for_station  # 집합 연산(아직 방송되지 않은 주 중에서 현재 고려하고 있는 방송국이 커버하는 주의 집합)
        if len(covered) > len(states_covered):  # 이 방송국이 현재의 best_station보다 더 많은 주를 커버하는지 확인
            best_station = station
            states_covered = covered
    states_needed -= states_covered  # 이 방송국에서 커버하는 주는 이제 더 이상 고려할 필요가 없다
    final_stations.add(best_station)
print(final_stations)
