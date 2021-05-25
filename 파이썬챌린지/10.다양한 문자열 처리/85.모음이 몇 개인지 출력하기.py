word = input("Enter a word: ")
count = 0
for x in word:
    if x in ['a', 'e', 'i', 'o', 'u']:
        count += 1
print(f"vowel count is {count}")
