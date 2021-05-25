poem = "부드러운 것이 강하다 자신이 가루가 될 때 까지 철저하게 부서져본 사람만이 그걸 안다."
print(poem)
start, end = map(int, input("Enter which part do you want to see"
                            "(start and end): ").split())
print(poem[start:end])
