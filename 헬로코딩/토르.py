import random
import time


class Character:
    p1 = [70, 50, 100]  # 아이언맨 스텟
    p2 = [60, 50, 100]  # 캡틴아메리카 스텟
    p3 = [90, 20, 100]  # 토르 스텟
    p4 = [100, 50, 300]  # 스텟 리스트들 선언
    members = dict()  # 빈 딕셔너리 생성

    def __init__(self):  # 클래스 선언할때 멤버 딕셔너리 초기화, 구조: 이름: (스텟)
        self.members = {self.numToString(1): self.p1, \
                        self.numToString(2): self.p2, \
                        self.numToString(3): self.p3, \
                        self.numToString(0): self.p4}

    def getInfo(self, argStr):  # members 딕셔너리에서 이름을 검색해서 스텟 반환하는 함수
        return self.members[argStr]

    def numToString(self, argNum):  # 정해진 숫자를 파라미터로 이름을 반환하는 함수
        if argNum == 1:
            return "IronMan"
        elif argNum == 2:
            return "CaptainAmerica"
        elif argNum == 3:
            return "Thor"
        else:
            return "Thanos"


def printInfo(nameStr, statList):  # 이름과 스텟 리스트를 받아서 적당히 출력하는 함수
    print("이름: " + nameStr,
          "\n공격력: " + str(statList[0]),
          "\n방어력: " + str(statList[1]),
          "\n체력: " + str(statList[2])
          )
    return


def runBattle(arg1, arg2):  # 배틀을 시작해서 결과를 반환하는 함수
    while True:
        arg1[2] -= arg2[0] - arg1[1]  # 적군의 체력 = 적군의 체력 - (내 공격력 - 적군의 방어력)
        if arg1[2] <= 0: break;  # 적군의 체력이 0 이하가 되면 중지
        arg2[2] -= arg1[0] - arg2[1]  # 내 체력 = 내 체력 - (적군의 공격력 - 내 방어력)
        if arg2[2] <= 0: break;  # 내 체력이 0 이하가 되면 중지
    return (arg2[2] <= 0)  # 내 체력이 0 아래로 됬는지 True/False 형태로 반환


t1 = Character()  # 클래스 선언 >> __init__
enemyNumbers = list(range(1, 4))  # 1부터 3까지의 숫자를 리스트에 넣기(적군 숫자 리스트)
random.seed(time.time())  # 랜덤을 잘나오게 하기 위해 현재 시간(timestamp)로 seed 값을 설정함

print("1. IronMan 2. CaptainAmerica 3. Thor")
f1 = input("당신의 캐릭터 번호를 선택해주세요(1,2,3):")
playerName = t1.numToString(int(f1))  # 누른 번호로 이름을 가져옴
playerStat = t1.getInfo(playerName)  # 가져온 이름으로 스텟을 가져옴
enemyNumbers.remove(int(f1))  # 적군의 숫자들이 들어있어야 하기에 내 숫자는 리스트에서 제거(남은 숫자는 2개)
random.shuffle(enemyNumbers)  # 적군 리스트 섞기(랜덤으로 적이 나와야 하기에)

enemyName = t1.numToString(enemyNumbers.pop(0))  # 적군 리스트에서 가장 앞에 있는 것을 빼와서 이름을 가져옴(남은 숫자는 1개)
enemyStat = t1.getInfo(enemyName)  # 적군의 이름으로 스텟을 가져옴
print("***첫 번째 스테이지***\n-—내 캐릭터--")
printInfo(playerName, playerStat)  # 이름과 스텟 리스트로 정보를 출력하는 함수 호출
print("--적 캐릭터--")
printInfo(enemyName, enemyStat)
print("--배틀--\n")
if runBattle(enemyStat, playerStat):  # 만약 내 체력이 0 이하가 됐다면
    print("당신이 졌습니다!\n")
    quit()  ## 프로그램 종료
else:
    print("당신이 이겼습니다!\n")

##### 1라운드 종료 #####

playerStat[1] += 10  # 방어력 + 10
playerStat[2] = 100  # 체력 원상복구
enemyName = t1.numToString(enemyNumbers.pop(0))
enemyStat = t1.getInfo(enemyName)

print("***두 번째 스테이지***\n-—내 캐릭터--")
printInfo(playerName, playerStat)
print("--적 캐릭터--")
printInfo(enemyName, enemyStat)
print("--배틀--\n")
if runBattle(enemyStat, playerStat):
    print("당신이 졌습니다!")
    quit()
else:
    print("당신이 이겼습니다!")

##### 2라운드 종료 #####

playerStat[0] += 10  # 공격력 + 10
playerStat[1] += 10  # 방어력 + 10
playerStat[2] = 300  # 체력 300으로 상승
enemyName = t1.numToString(0)
enemyStat = t1.getInfo(enemyName)

print("***세 번째 스테이지***\n-—내 캐릭터--")
printInfo(playerName, playerStat)
print("--적 캐릭터--")
printInfo(enemyName, enemyStat)
print("--배틀--\n")
if runBattle(enemyStat, playerStat):
    print("당신이 졌습니다!")
    quit()
else:
    print("당신이 이겼습니다!")

##### 3라운드 종료 #####
