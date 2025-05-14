/**
 * @param {int[]}num_list
 * @returns {number}
 */
const solution = (num_list) => {
    const {evens, odds} = num_list.reduce((acc, curr) => {
        if (curr % 2 === 0) acc.evens.push(curr)
        else acc.odds.push(curr)
        return acc
    }, {
        evens: [],
        odds: [],
    })
    return Number(evens.join('')) + Number(odds.join(''))
}

console.log(solution([3, 4, 5, 2, 1]))
console.log(solution([5, 7, 8, 3]))