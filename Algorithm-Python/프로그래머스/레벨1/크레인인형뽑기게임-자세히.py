# 4, 3, 1, 1, 3, 2, 0, 4
# [1, 1]=>삭제, [3, 3]=>삭제 총 4개 사라짐
# 출력 : 4
board = [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]]
score = 0
"""리스트 전체 출력"""


def print_all():
    for x in range(5):
        print(f'{x + 1}', end=' ')
    print()
    print('*' * 9)
    for x in board:
        for y in x:
            print(y, end=' ')
        print()


moves = [1, 5, 3, 5, 1, 2, 1, 4]
result = []
stop = False
# print_all()
print('움직일 값들 :', end=' ')
for i in moves:
    print(i, end=' ')
print()
for z in moves:
    print_all()
    z = z - 1
    print(f'{moves}중에서 <{z + 1}> 옮기는중...')
    for x in range(len(board)):
        for y in range(len(board[x])):
            if y == z and board[x][y] != 0:
                result.append(board[x][y])
                print('\033[1m' + '\033[34m', board[x][y], ' 뽑았다...!', '\033[0m')
                board[x][y] = 0
                stop = True
                print_all()
                print(f'현재 뽑은 스택:{result}')
                top = result[-1]
                if len(result) >= 2:
                    fore_top = result[-2]
                    # print(top, fore_top)
                    if top == fore_top:
                        print('\033[32m' + '인형뽑기 아이템이 같아서 사라지고 점수 +2점 획득!!' + '\033[0m')
                        result.pop()
                        result.pop()
                        score += 2
                break
        if stop:
            stop = False
            break
    print()
    if stop:
        break
print(f'총 뽑은 인형 :{result}')
print('--바뀐결과--')
print_all()
print('\033[32m' + '총 점수 : ' + '\033[31m', score, '\033[0m')
"""리스트 인덱스로 접근해서 출력"""
# for x in range(len(board)):
#     for y in range(len(board[x])):
#         print(f'{board[x][y]}[{x},{y}]', end=' ')
#     print()
