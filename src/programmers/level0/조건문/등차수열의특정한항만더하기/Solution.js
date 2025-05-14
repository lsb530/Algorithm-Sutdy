/**
 * @param {number} a
 * @param {number} d
 * @param {boolean[]} included
 * @returns {number}
 */
const solution = (a, d, included) => {
    return included
        .reduce((sum, include, index) => {
            return include ? sum + a + (index * d) : sum;
        }, 0);
}

console.log(solution(3, 4, [true, false, false, true, true])); // 결과 확인