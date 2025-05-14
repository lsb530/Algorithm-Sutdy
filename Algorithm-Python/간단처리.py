trump_tweet = list(map(str, input().split()))
hashtag, mention, etc = [], [], []
for word in trump_tweet:
    check = word[0]
    if check == '#':
        hashtag.append(word[1:])
    elif check == '@':
        mention.append(word[1:])
    else:
        etc.append(word)
print(f'hash list : {hashtag}\nmention list : {mention}\ntext list : {etc}')
