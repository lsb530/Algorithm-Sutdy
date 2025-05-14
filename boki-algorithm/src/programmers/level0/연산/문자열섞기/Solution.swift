import Foundation

func solution(_ str1:String, _ str2:String) -> String {
//    return zip(str1, str2).map { String($0) + String($1) }.joined()
    var result = ""
    for i in 0..<str1.count {
        let idx = str1.index(str1.startIndex, offsetBy: i)

        result.append(str1[idx])
        result.append(str2[idx])
    }
    return result
}