/**
 * @param {int[]} num_list
 * @returns {int[]}
 */
const solution = (num_list) => {
    const [a, b] = [...num_list].reverse();
    return [...num_list, a > b ? (a - b) : a * 2];
}