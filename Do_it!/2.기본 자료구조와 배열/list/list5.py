#   리스트의 모든 원소를 역순으로 스캔하기

x = ['John', 'George', 'Paul', 'Ringo']

for i in reversed(x):
    print(i)

print('---')

for i in x[::-1]:
    print(i)
