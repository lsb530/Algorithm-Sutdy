# 합집합: 두 집합을 합침
# 교집합: 두 집합에 모두 포함되어 있는 원소들의 집합
# 차집합: 어떤 집합에서 다른 집합에 포함되어 있는 원소를 뺀 나머지 원소의 집합
fruits = set(["avocado", "tomato", "banana"])
vegetables = set(["beets", "carrots", "tomato"])
print(f'fruits: {fruits}')
print(f'vegetables: {vegetables}')
print()
print(fruits | vegetables)  # 합집합
print(fruits & vegetables)  # 교집합
print(fruits - vegetables)  # 차집합
print(vegetables - fruits)  # 차집합
