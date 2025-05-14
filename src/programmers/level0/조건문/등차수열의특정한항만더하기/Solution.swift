func solution(_ a: Int, _ d: Int, _ included: [Bool]) -> Int {
    return included.indices.filter { included[$0] }.map { a + d * $0 }.reduce(0, +)
}