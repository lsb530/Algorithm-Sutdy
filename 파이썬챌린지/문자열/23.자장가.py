story = input("Enter your history: ")
start, end = map(int, input().split(' '))
print(f"length is {len(story)}")
print(story[start:end])
