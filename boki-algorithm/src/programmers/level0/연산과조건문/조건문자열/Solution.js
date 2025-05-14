// const solution = (ineq, eq, n, m) => {
//     let answer = false
//     switch (ineq + eq) {
//         case '<=': answer = n <= m; break
//         case '<!': answer = n < m; break
//         case '>=': answer = n >= m; break
//         case '>!': answer = n > m; break
//     }
//     return answer ? 1 : 0
// }

// simple
const solution = (ineq, eq, n, m) => {
    const ops = {
        '>=': (n, m) => n >= m,
        '<=': (n, m) => n <= m,
        '>!': (n, m) => n > m,
        '<!': (n, m) => n < m,
    }
    const op = ops[ineq + eq]
    return Number(op(n, m))
}

console.log(solution('<', '=', 20, 50))
console.log(solution(">", "!", 41, 78))