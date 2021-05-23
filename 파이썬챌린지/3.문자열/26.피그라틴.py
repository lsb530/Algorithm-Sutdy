data = input("Enter a word: ")
answer = data[1:]+data[0]
if data[0] in ('a', 'e', 'i', 'o', 'u'):
    answer += 'way'
else:
    answer += 'ay'
print(answer)
