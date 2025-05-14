import Foundation

// 왜 시간 초과가 나냐??
func solution(_ number: Int, _ n: Int, _ m:Int) -> Int { number % n == 0 && number % m == 0 ? 1 : 0 }

// 이것도 왜 런타임 에러가 나냐??
func solution(_ number: Int, _ n: Int, _ m:Int) -> Int {
    if (number % n == 0 && number % m == 0) {
        return 1
    }
    return 0
}

// 이 코드만 통과하네?? 서버 참 이상하네..
func solution(_ number:Int, _ n:Int, _ m:Int) -> Int {
    return number % n == 0 && number % m == 0 ? 1 : 0
}