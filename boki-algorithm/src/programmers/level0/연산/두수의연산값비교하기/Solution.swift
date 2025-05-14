import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
//    let combinedString = String(a) + String(b)
//     if let x = Int(combinedString) {
//         let y = 2 * a * b
//         return max(x, y)
//     }
//    return 0

    let x = Int(String(a) + String(b))!
    let y = 2 * a * b
    if (x >= y) {
        return x
    }
    return y
}

print(solution(2, 91))
