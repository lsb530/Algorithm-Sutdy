
const solution = n => {
    let answer = 0
    const isEven = n % 2 === 0
    let start = isEven ? 2 : 1
    for (let i = start; i <= n; i += 2) {
        answer += isEven ? i * i : i
    }
    return answer
}

// simple
const solution = n => {
    const isEven = n % 2 === 0;
    let start = isEven ? 2 : 1;
    // [ start, start+2, start+4, ..., n]
    return Array.from(
        {length: (n - start) / 2 + 1},
        (_, i) => start + i * 2)
        .reduce((acc, curr) => acc + (isEven ? curr * curr : curr), 0);
}

console.log(solution(7)); // 예시로 5를 입력하여 테스트
console.log(solution(10)); // 예시로 5를 입력하여 테스트
