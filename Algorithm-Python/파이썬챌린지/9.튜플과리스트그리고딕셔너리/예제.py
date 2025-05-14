# Tuple
fruit_tuple = ("apple", "banana", "strawberry", "orange")
print(fruit_tuple.index("strawberry"))  # return 2
print(fruit_tuple[2])  # return strawberry

# List
names_list = ["John", "Tim", "Sam"]
print(names_list)
del names_list[1]  # delete "Tim"
print(names_list)
names_list.append(input("Add a name: "))  # 끝에 추가
print(names_list)
print("sorted(list): 정렬하지 않음")
print(sorted(names_list))  # 알파벳 정렬(리스트 순서 정렬하지 않음)
print("origin:", names_list)
names_list.sort()  # 알파벳 정렬(리스트 순서 재정렬)
print("list.sort(): 리스트 정렬")
print(names_list)

# Dictionary
colours = {1: "red", 2: "blue", 3: "green"}
print(colours)
colours[2] = "yellow"
print(colours)

