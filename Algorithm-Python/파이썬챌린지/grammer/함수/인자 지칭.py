def add(a, b):
    print('함수의 결과:', a + b)


add(b=3, a=7)

# 함수 안에서 함수 밖의 변수 데이터를 변경해야 할 때
a = 0


def func():
    global a
    a += 1


for i in range(10):
    func()
print(a)
