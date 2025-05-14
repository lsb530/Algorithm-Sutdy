# 순서가 없다(인덱싱 불가)
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'
print(data)

if '사과' in data:
    print("'사과'를 키로 가지는 데이터가 존재합니다.")

# 키 데이터만 담은 리스트
keys_list = data.keys()
# 값 데이터만 담은 리스트
value_list = data.values()
print(keys_list)
print(value_list)

# 각 키에 따른 값을 하나씩 출력
for key in keys_list:
    print(data[key])
