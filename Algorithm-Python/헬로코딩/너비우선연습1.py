from collections import deque

graph = {}
graph["S"] = ["A", "B"]
graph["A"] = ["C", "F"]
graph["B"] = ["C", "E"]
graph["C"] = []
graph["E"] = ["F"]


def destination(n):
    return n == 'F'


def search(n):
    search_queue = deque()
    search_queue += graph[n]
    searched = []
    while search_queue:
        out = search_queue.popleft()
        if not out in searched:
            if destination(out):
                print(f'{out} is destination!')
                return True
            else:
                search_queue += graph[out]
                searched.append(out)
    return False


print(graph)
search("S")
