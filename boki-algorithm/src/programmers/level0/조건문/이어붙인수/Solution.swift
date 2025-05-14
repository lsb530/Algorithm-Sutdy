import Foundation

func solution(_ numList: [Int]) -> Int {
    let evens = numList.filter { $0 % 2 == 0 }.map { String($0) }.joined()
    let odds = numList.filter { $0 % 2 != 0 }.map { String($0) }.joined()

    return (Int(evens) ?? 0) + (Int(odds) ?? 0)
}