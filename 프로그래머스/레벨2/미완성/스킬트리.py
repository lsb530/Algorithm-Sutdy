def solution(skill, skill_trees):
    answer = 0
    # C/B/D가 없다면 skill_trees 길이만큼 반환
    # C/B/D를 만났을때 그 인덱스 저장. 거기서부터 시작
    # 그 이후부터 탐색
    # pop 아니면 push
    stack = []
    check = skill
    print(f'뀨:{stack[:-1]}')
    stack.append(3)
    print(f'뀨:{stack[-1]}')
    # for i in check:
    #     print(i)    # C B D
    for i in skill_trees:
        for j in i:
            if j in check:
                stack.append(j)
            print(j, end='')
        print()
    print(stack)
    return answer


skill = "CBD"  # C-B-D
# C 일때 B만을 기다림. D가 오면 False
# B 일때 D만을 기다림
# 나머진 다 False

# skill = "324"
skill_trees = ["BACDE", "CBADF", "AECB", "BDA"]
# skill_trees = ["21345", "32146", "1532", "241"]
solution(skill, skill_trees)
