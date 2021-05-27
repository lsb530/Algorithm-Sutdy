#   리스트의 복사시 copy와 deepcopy 사용 차이점
import copy  # deepcopy를 사용하기 위한 copy 모듈을 임포트

a = [[1, 2, 3], [4, 5, 6]]
b = a.copy()  # a를 b로 얕은 복사
a[0][1] = 9
print('-' * 6 + '얕은 복사' + '-' * 6)
print(f'a = {a}')
print('  a[0][1] = 9')
print(f'b = {b}')
print('얕은 복사는 리스트 안의 모든 원소가 참조하는 곳까지 복사됨')

a = [[1, 2, 3], [4, 5, 6]]
b = copy.deepcopy(a)  # a를 b로 깊은 복사
a[0][1] = 9
print('-' * 6 + '깊은 복사' + '-' * 6)
print(f'a = {a}')
print('  a[0][1] = 9')
print(f'b = {b}')
print('깊은 복사는 참조값 뿐만 아니라 참조하는 객체 자체를 복사한다.')
print('즉, 객체가 갖는 모든 멤버(값과 참조 형식) 모두를 복사하므로 전체복사라고도 한다')
