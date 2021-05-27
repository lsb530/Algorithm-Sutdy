def solution(numbers, hand):
    answer = ''
    # 0일때는 8을 우선으로 7, 9에 가까운 엄지가 누르도록 만듬
    # 2,5,8일때는 1/3, 4/6, 7/9에서 가까운 엄지손가락이 누르도록
    # 2,5,8인데 좌우 엄지가 동일 선상인 경우는 hand에 따라서 엄지가 눌리도록
    # 1/4/7은 L이고 3/6/9는 R
    phone = [[1, 2, 3], [4, 5, 6], [7, 8, 9], [-1, 0, 1]]
    num = [0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 4, 5]  # 1,2,3,4,5,6,7,8,9의 인덱스
    index_num = []
    for i in phone:
        print(i)
    for i, v in enumerate(phone):
        for j, m in enumerate(v):
            print(f'[{m}]({i}+{j}={i + j})', end=' ')
            index_num.append([i, j])
        print()
    left_pos = -1
    right_pos = -1
    add = 'L' if hand == 'left' else 'R'
    lv = 0
    rv = 0
    # for i in index_num:
    #     print(i)
    for i in numbers:
        if i in [2, 5, 8, 0]:  # 3.가운데 엄지처리
            # 계산식 2개 필요함(절대값, index값) 해서 2개 &&로 묶기
            # 1.절댓값
            l1 = abs(i - lv)
            r1 = abs(i - rv)
            # 2.인덱스값
            mid_pos = num[i - 1]
            # left / right
            m = index_num[i - 1]
            l = index_num[lv - 1]
            r = index_num[rv - 1]

            print(l, m, r)
            l2 = abs(mid_pos - left_pos)
            r2 = abs(mid_pos - right_pos)

            if l1 == r1:  # 가로동일선상(값)에 있을 때
                answer += add
                if add == 'L':
                    # left_pos = i
                    lv = i
                    left_pos = num[i - 1]
                else:
                    # right_pos = i
                    rv = i
                    right_pos = num[i - 1]

            else:  # 동일선상에 있지 않을 때
                print('뿌')
                # 인덱스가 동일선상에 있을 때
                if (m[0] == l[0] or m[1] == l[1]) and (m[0] == r[0] or m[1] == r[1]):
                    answer += add

                elif l1 < r1:
                    added = 'L'
                    # left_pos = i
                    lv = i
                    left_pos = num[i - 1]
                else:
                    added = 'R'
                    # right_pos = i
                    rv = i
                    right_pos = num[i - 1]
                answer += added
        elif i in [1, 4, 7]:  # 1.왼손 엄지처리
            answer += 'L'
            # left_pos = i
            lv = i
            left_pos = num[i - 1]
        elif i in [3, 6, 9]:
            answer += 'R'  # 2.오른손 엄지처리
            # right_pos = i
            rv = i
            right_pos = num[i - 1]
        print(f'press:{i}')
        print(f'{left_pos}({lv}),{right_pos}({rv})', end=' ')
        print(answer)
        print()
    # print(f'끝:{answer[-1]}')
    return answer


numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
print(solution(numbers, "right"))
#               numbers               hand	    result
# [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
# [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
# [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	    "right"	"LLRLLRLLRL"
