voted = {}  # voted = dict()랑 똑같음. 해시 테이블을 만듬


def check_voter(name):
    if voted.get(name):
        print('이미 투표했어요. 돌려 보내세요')
    else:
        voted[name] = True
        print('투표하게 해주세요')


vote_list = ["Tom", "Mike", "Allen", "Tom"]

for i in vote_list:
    print(f'투표자: {i}', end=' ')
    check_voter(i)
