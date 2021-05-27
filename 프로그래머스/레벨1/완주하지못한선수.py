import itertools


def solution(p, c):
    p.sort()
    c.sort()
    t = list(itertools.zip_longest(p, c))
    print(t)
    for p, c in list(itertools.zip_longest(p, c)):
        if p != c:
            return p


participant = ['leo', 'kiki', 'eden']
completion = ['eden', 'kiki']
print(solution(participant, completion))
participant = ['marina', 'josipa', 'nikola', 'vinko', 'filipa']
completion = ['josipa', 'filipa', 'marina', 'nikola']
print(solution(participant, completion))
participant = ['mislav', 'stanko', 'mislav', 'ana']
completion = ['stanko', 'ana', 'mislav']
print(solution(participant, completion))
