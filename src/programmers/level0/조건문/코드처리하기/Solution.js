
const solution = (code) => {
    let answer = ''
    let mode = 0
    for (let i = 0; i < code.length; i++) {
        if (code[i] === '1') {
            mode = (mode + 1) % 2
        } else {
            if (i % 2 === mode) answer += code[i]
        }
    }
    return answer.length === 0 ? 'EMPTY' : answer
}

console.log(solution("abc1abc1abc"));