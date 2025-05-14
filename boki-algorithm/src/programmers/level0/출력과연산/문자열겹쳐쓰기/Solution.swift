import Foundation

func solution(_ my_string:String, _ overwrite_string:String, _ s:Int) -> String {
    // 1번째 방법
    let result = String(my_string.prefix(s)) + overwrite_string + String(my_string.suffix(my_string.count - (s+overwrite_string.count)))

    // 2번째 방법
    var answer = my_string
    let startIndex = answer.index(answer.startIndex, offsetBy: s)
    let endIndex = answer.index(startIndex, offsetBy: overwrite_string.count)
    let range = startIndex..<endIndex
    answer.replaceSubrange(range, with: overwrite_string)

    // String Range 숫자 디버깅방법
//    let distance1 = answer.distance(from: answer.startIndex, to: startIndex)
//    let distance2 = answer.distance(from: answer.startIndex, to: endIndex)
//    let distance3 = answer.distance(from: startIndex, to: endIndex)
//    print(distance1)
//    print(distance2)
//    print(distance3)


    return answer
}

print(solution("He11oWor1d", "lloWorl", 2))