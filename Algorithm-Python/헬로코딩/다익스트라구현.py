# 3개의 해시 테이블: 그래프 / 가격 / 부모
# 그래프
graph = {}
graph["start"] = {}
graph["start"]["a"] = 6
graph["start"]["b"] = 2
print(graph["start"].keys())
print(graph["start"]["a"])
print(graph["start"]["b"])

graph["a"] = {}
graph["a"]["fin"] = 1
graph["b"] = {}
graph["b"]["a"] = 3
graph["b"]["fin"] = 5

graph["fin"] = {}  # 도착점에는 이웃이 없다

# 가격(가격을 모르는 정점의 가격은 무한대로 설정한다)
infinity = float("inf")  # 무한대
costs = {}
costs["a"] = 6
costs["b"] = 2
costs["fin"] = infinity

# 부모
parents = {}
parents["a"] = "start"
parents["b"] = "start"
parents["fin"] = None
# 각 정점을 한번만 처리하기 위한 배열
processed = []


def find_lowest_cost_node(costs):
    lowest_cost = float("inf")
    lowest_cost_node = None
    for node in costs:  # 모든 정점을 확인
        cost = costs[node]  # 아직 처리하지 않은 정점 중 더 싼 것이 있으면
        if cost < lowest_cost and node not in processed:
            lowest_cost = cost
            lowest_cost_node = node
    return lowest_cost_node


node = find_lowest_cost_node(costs)  # 아직 처리하지 않은 가장 싼 정점을 찾는다
while node is not None:  # 모든 정점을 처리하면 반복문이 종료된다
    cost = costs[node]
    neighbors = graph[node]
    for n in neighbors.keys():  # 모든 이웃에 대해 반복함
        new_cost = cost + neighbors[n]
        if costs[n] > new_cost:  # 만약 이 정점을 지나는 것의 가격이 더 싸다면
            costs[n] = new_cost  # 정점의 가격을 갱신하고
            parents[n] = node  # 부모를 이 정점으로 새로 설정한다
    processed.append(node)  # 정점을 처리한 사실을 기록한다
    node = find_lowest_cost_node(costs)  # 다음으로 처리할 정점을 찾아 반복한다
