#   선형 검색 알고리즘(실습 3-1)을 보초법으로 수정
#   찾을 엘리먼트를 끝에 추가함으로써 선형검색의 종료조건 판단 하나를 제거한다
#   검색할 값을 찾지 못하고 배열의 맨 끝을 지나갔습니까?<== 생략
import copy
from typing import Any, Sequence


def seq_search(seq: Sequence, key: Any) -> int:
    print('선형검색에서 보초법(Sentinel Method)를 이용함')
    print('찾을 원소를 맨 끝에 추가해서 조건문 하나를 제거(횟수를 반으로 줄임)')
    print('return 문에서 if문이 1번만 추가됨')
    """시퀀스 seq에서 key와 일치하는 원소를 선형 검색(보초법)"""
    a = copy.deepcopy(seq)  # seq를 복사
    a.append(key)  # 보초 key를 추가

    i = 0
    while True:
        if a[i] == key:
            break  # 검색에 성공하면 while문을 종료
        i += 1
    return -1 if i == len(seq) else i


if __name__ == '__main__':
    num = int(input('원소 수를 입력하세요 : '))  # num값을 입력받음
    x = [None] * num  # 원소 수가 num인 배열을 생성

    for i in range(num):
        x[i] = int(input(f'x[{i}] : '))

    ky = int(input('검색할 값을 입력하세요 : '))  # 검색할 키 ky를 입력받음

    idx = seq_search(x, ky)  # ky와 값이 같은 원소를 x에서 검색
    if idx == -1:
        print('검색값을 찾는 원소가 존재하지 않습니다.')
    else:
        print(f'검색값은 x[{idx}]에 있습니다.')
