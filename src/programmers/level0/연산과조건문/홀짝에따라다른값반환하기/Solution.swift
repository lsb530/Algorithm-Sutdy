import Foundation

func solution(_ n:Int) -> Int {
    let isEven = n % 2 == 0
    var answer = 0
    var start = isEven ? 2 : 1
    for i in stride(from: start, through: n, by: 2) {
        answer += isEven ? i * i : i
    }
    return answer
}

// simple
//func solution(_ n:Int) -> Int {
//    if n % 2 == 0 { return stride(from: 2, through: n, by: 2).reduce(0) { $0 + $1 * $1 } }
//    else { return stride(from: 1, through: n, by: 2).reduce(0, +) }
//}

print(solution(7))
print(solution(10))
