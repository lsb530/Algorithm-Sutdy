import Foundation

func solution(_ code:String) -> String {
    var answer = ""
    var mode = 0

    code.enumerated().forEach {
        if $0.element == "1" {
            mode ^= 1
        }
        else {
            if ($0.offset % 2 == mode) {
                answer += String($0.element)
            }
        }
    }
    return answer.isEmpty ? "EMPTY" : answer
}

print(solution("abc1abc1abc"))
