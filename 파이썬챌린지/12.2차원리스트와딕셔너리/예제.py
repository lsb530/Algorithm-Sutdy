# 2차원 리스트
simple_array = [[2, 5, 8], [3, 7, 4], [1, 6, 9]]
print(simple_array)
print(simple_array[1])  # [3, 7, 4]
print(simple_array[2][1])  # 6
simple_array[2][1] = 5
print(simple_array[2][1])  # 5
print(simple_array[1][2])  # 4
simple_array[1].append(3)  # [3, 7, 4, 3]
print(simple_array)

# 딕셔너리
data_set = {'A': {'x': 54, 'y': 82, 'z': 91}, 'B': {'x': 75, 'y': 29, 'z': 80}}
print(data_set)
print(f"data_set['A'] = {data_set['A']}")
print(f"data_set['B']['y'] = {data_set['B']['y']}")
for i in data_set:
    print(f"data_set[i]['y'] = {data_set[i]['y']}")
data_set['B']['y'] = 53
print(f"data_set['B']['y'] = {data_set['B']['y']}")
# grades[name] = {"Maths":mscore,"English":escore}
# for name in grades:
#     print((name), grades[name]["English"])
# del list[getRid]
