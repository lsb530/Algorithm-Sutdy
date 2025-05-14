/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @returns {number}
 */
const solution = (a, b, c) => {
    const sum = a + b + c
    const squareSum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)
    const cubeSum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)
    if (a !== b && b !== c && c !== a) {
        return sum
    }
    else if (a === b && b === c && c === a) {
        return sum * squareSum * cubeSum

    }
    else {
        return sum * squareSum
    }
}

console.log(solution(2,6,1))
console.log(solution(5,3,3))
console.log(solution(4,4,4))