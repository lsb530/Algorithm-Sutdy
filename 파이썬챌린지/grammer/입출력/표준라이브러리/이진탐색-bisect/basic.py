# 정렬된 배열에서 특정한 원소를 찾아야 할때
# bisect_left(a, x) : 정렬된 순서를 유지하면서 리스트 a에 데이터 x를
#   삽입할 가장 왼쪽 인덱스를 찾음
# bisect_right(a, x) : 위와 반대
from bisect import bisect_left, bisect_right

a = [1, 2, 4, 4, 8]
x = 4

print(bisect_left(a, x))
print(bisect_right(a, x))
