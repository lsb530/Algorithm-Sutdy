from collections import deque

graph = {}
graph["you"] = ["alice", "bob", "claire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["claire"] = ["thom", "jonny"]
graph["anuj"] = []
graph["peggy"] = []
graph["thom"] = []
graph["jonny"] = []

"""망고 판매상 확인. m으로 끝나면 그 사람이 망고 판매상임"""


def person_is_seller(name):
    return name[-1] == 'm'


def search(name):
    search_queqe = deque()  # 새 큐를 생성
    search_queqe += graph[name]  # 모든 이웃을 탐색 큐에 추가
    searched = []  # 이 배열은 이미 확인한 사람을 추적하기 위한 것
    while search_queqe:  # 큐가 비어있지 않는 한 계속 실행
        print(f'큐 확인: {search_queqe}')
        person = search_queqe.popleft()  # 큐의 첫 번째 사람을 꺼냄
        if not person in searched:  # 이전에 확인하지 않은 사람만 확인
            if person_is_seller(person):  # 망고 판매상인지 확인
                print(f'{person} is a mango seller!')
                return True
            else:
                search_queqe += graph[person]
                searched.append(person)
    return False


print(graph)
search("you")

"""실행 시간"""
# 너비 우선 탐색은 O(사람의 수 + 간선의 수)가 되고, 보통 O(V+E)라고 표현합니다.
