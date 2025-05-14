x = [154, 634, 892, 345, 341, 43]
print(f"전체 리스트: {x}")
print(f"길이 출력: {len(x)}")
print(f"x[1:4] is {x[1:4]}")
print("(for i in x)")
for i in x:
    print(i, end=' ')
print()
num = int(input("Enter number: "))
if num in x:
    print(num, "is in the list")
else:
    print("Not in the list")
x.insert(2, 420)
print(f"x.insert(2, 420) => {x}")
x.remove(892)
print(f"x.remove(값=892) => {x}")
x.append(993)
print(f"x.append(993) => {x}")
