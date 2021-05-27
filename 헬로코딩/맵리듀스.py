# 맵 함수: 배열을 입력으로 받아서 모든 원소에 같은 함수를 적용한다
from functools import reduce

arr1 = [1, 2, 3, 4, 5]
arr2 = map(lambda x: 2 * x, arr1)
"""일련의 URL을 넣어주면 각 페이지를 다운로드해서 그 내용을 arr2에 저장"""
# arr3 = A list of URLs
# arr4 = map(download_page, arr3)

# 리듀스 함수: 어려움. 핵심=>리스트 전체의 원소를 하나의 원소로 축소함
print(arr2)
for i in arr1:
    print(i)
k = reduce(lambda x, y: x + y, arr1)
print("합산", k)
