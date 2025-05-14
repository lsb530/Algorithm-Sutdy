sports = ["soccer", "baseball"]
print(sports)
sport = input("What is your favorite sport?: ")
if sport not in sports:
    sports.append(sport)
    sports.sort()
    print(sports)
else:
    print("Already existed in the list")
