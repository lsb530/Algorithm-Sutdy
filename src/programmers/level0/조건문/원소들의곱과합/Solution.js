/**
 * @param {int[]}num_list
 * @returns {number}
 */
const solution = (num_list) => {
    const mul = num_list.reduce((acc, cur) => acc * cur, 1)
    const sum = num_list.reduce((acc, cur) => acc + cur, 0)
    return mul < sum ** 2 ? 1 : 0
}

const x = solution([3, 4, 5, 2, 1])
const y = solution([5, 7, 8, 3])
console.info('x', x)
console.info('y', y)