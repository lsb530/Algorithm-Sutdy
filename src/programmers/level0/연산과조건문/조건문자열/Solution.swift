import Foundation

func solution(_ ineq:String, _ eq:String, _ n:Int, _ m:Int) -> Int {
    let expression = ineq + eq
    if (expression == "<=") {
        return n <= m ? 1 : 0
    }
    else if (expression == "<!") {
        return n < m ? 1 : 0
    }
    else if (expression == ">=") {
        return n >= m ? 1 : 0
    }
    else {
        return n > m ? 1: 0
    }
}

print(solution("<", "=", 20, 50))
print(solution(">", "!", 41, 78))
