import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var answer = num_list
    let before = num_list[num_list.count - 2] // n-1
    let last = num_list[num_list.count - 1] // n

    if last > before {
        answer.append(last - before)
    } else {
        answer.append(last * 2)
    }

    return answer
}