word = input("Enter a word: ")
length = len(word)
# for i in range(length - 1, -1, -1):
#     print(word[i])
num = 1
for i in word:
    index = length - num
    print(word[index])
    num += 1
