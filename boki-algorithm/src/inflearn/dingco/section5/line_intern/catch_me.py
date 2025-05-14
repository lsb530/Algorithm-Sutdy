import sys
from collections import deque

c = 11
b = 2

# c = 10
# b = 3

# c = 51
# b = 50

# c = 550
# b = 500

# 1초뒤
# c: 12
# b: 3(+1)
#
# 2초뒤
# c: 14
# b: 6(*2)
#
# 3초뒤
# c: 17
# b: 12(*2)
#
# 4초뒤
# c: 21
# b: 13(+1)
#
# 5초뒤
# c: 26
# b: 26(*2)

# c = a + n

cony_map = {

}
cony_way = [0] * 200001
def cony_speed(c, n, cnt):
    if c >= 200000:
        return
    cony_way[c] = cnt
    cony_map[cnt] = c
    n = n + 1
    cony_speed(c + n, n, cnt + 1)

cony_speed(c, 0, 0)

cony_able_way = []
for i in range(0, len(cony_way)):
    if cony_way[i] != 0:
        cony_able_way.append(i)

print(cony_able_way)
print(cony_way[:50])
print(cony_map)

# TODO: 풀어야됨
brown_way = [sys.maxsize] * 200001
def brown_speed(b, sum, op, cnt):
    # print(f'sum: {sum}, op: {op}, cnt: {cnt}')
    # print(sum)
    # print(cony_map[cnt])
    # print(brown_way[sum])

    # if cnt > 20:
    #     return

    if cony_map[cnt] == sum:
        print('wow', cony_map[cnt], 'cnt', cnt)
        return cnt

    # if sum >= 200000 or sum <= 0 or cnt > 10:
    if sum >= 200000 or sum <= 0 or cnt > 5:
    # if sum >= 200000 or sum <= 0:
    # if sum >= 200000 or sum <= 0 or cony_map[cnt] != sum:
    # if sum >= 200000 or sum <= 0 or cony_map[cnt] > brown_way[sum]:
        return cnt

    # print(cnt, cony_map[cnt], sum)
    if cony_map[cnt] == sum:
        print('wow', cony_map[cnt], 'cnt', cnt)

    if sum >= 0 and cony_way[sum] != 0:
        brown_way[sum] = min(brown_way[sum], cnt)

    # if brown_way[sum] != sys.maxsize:
    #     print(brown_way[sum])

    x = brown_speed(b, sum - 1, '-', cnt+1)
    y = brown_speed(b, sum + 1, '+', cnt+1)
    z = brown_speed(b, sum * 2, '*', cnt+1)
    print(f'x={x}, y={y}, z={z}')

brown_speed(b, b, '', 0)
print(brown_way[:50])

cony_able_way = []
brown_able_way = []
answer = 0
for i in range(0, len(cony_way)):
    # if cony_way[i] != 0:
    if brown_way[i] != sys.maxsize:
        print(i, cony_way[i], brown_way[i])
        if cony_way[i] == brown_way[i]:
            answer = cony_way[i]
            break
        # print(brown_way)
        # cony_able_way.append(i)

print(answer)

def catch_me(cony_loc, brown_loc):
    time = 0
    queue = deque()
    queue.append((brown_loc, 0))
    visited = [{} for _ in range(2000001)]
    # visited[10] = {1, 10, 30, 600} -> 1, 10, 30, 600초 때 10이라는 위치에 도달했다

    while cony_loc <= 200000:
        cony_loc += time
        if time in visited[cony_loc]:
            return time

        for i in range(0, len(queue)): # 왜 while queue를 안쓰고 for문을 썼을까?
            current_position, current_time = queue.popleft()

            new_position = current_position - 1
            new_time = current_time + 1
            if new_position >= 0 and new_time not in visited[new_position]:
                visited[new_position][new_time] = True
                queue.append((new_position, new_time))

            new_position = current_position + 1
            if new_position < 200001 and new_time not in visited[new_position]:
                visited[new_position][new_time] = True
                queue.append((new_position, new_time))

            new_position = current_position * 2
            if new_position < 200001 and new_time not in visited[new_position]:
                visited[new_position][new_time] = True
                queue.append((new_position, new_time))

        time += 1


# print(catch_me(c, b))  # 5가 나와야 합니다!
# print("정답 = 3 / 현재 풀이 값 = ", catch_me(10, 3))
# print("정답 = 8 / 현재 풀이 값 = ", catch_me(51, 50))
# print("정답 = 28 / 현재 풀이 값 = ", catch_me(550, 500))
