#   리스트의 모든 원소를 enumerate() 함수로 스캔하기
#   enumerate 함수는 인덱스와 원소를 짝지어 튜플로 꺼내는 내장 함수
#   (1,'John'), (2,'George')식으로 꺼냄

x = ['John', 'George', 'Paul', 'Ringo']

for i, name in enumerate(x, 1):
    print(f'{i}번째 = {name}')
