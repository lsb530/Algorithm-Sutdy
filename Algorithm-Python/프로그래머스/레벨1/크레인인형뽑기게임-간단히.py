board = [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]]
moves = [1, 5, 3, 5, 1, 2, 1, 4]


def solution(board, moves):
    stop = False
    answer = 0
    result = []
    for z in moves:
        z -= 1
        for x in range(len(board)):
            for y in range(len(board[x])):
                if y == z and board[x][y] != 0:
                    result.append(board[x][y])
                    board[x][y] = 0
                    stop = True
                    top = result[-1]
                    if len(result) >= 2:
                        fore_top = result[-2]
                        if top == fore_top:
                            result.pop()
                            result.pop()
                            answer += 2
                    break
            if stop:
                stop = False
                break
        if stop:
            break
    return answer


print(solution(board, moves))
