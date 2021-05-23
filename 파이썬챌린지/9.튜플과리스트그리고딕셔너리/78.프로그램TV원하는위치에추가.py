programs = ["동물농장", "추적60분", "그것이알고싶다", "무엇이든물어보살"]
for x in programs:
    print(x)
program = input("Enter different program name: ")
index = int(input("Which index do you want to add?: "))
programs.insert(index, program)
print(programs)
