#    일반적인 형태
a = [1, 2, 3, 4, 5, 5, 5]
remove_set = {3, 5}
result = []
for i in a:
    if i not in remove_set:
        result.append(i)
print(result)

#   조건부 표현식
a = [1, 2, 3, 4, 5, 5, 5]
remove_set = {3, 5}
result = [i for i in a if i not in remove_set]
print(result)
