function solution(a, b) {
    const x = parseInt(a + "" + b);
    const y = parseInt(b + "" + a);
    return Math.max(x, y);
}

solution(9, 91);