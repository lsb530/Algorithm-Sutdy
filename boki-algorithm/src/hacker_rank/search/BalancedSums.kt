package hacker_rank.search

class BalancedSums {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // println(balancedSums(arrayOf(5, 6, 8, 1)))
            // println(balancedSums(arrayOf(1, 2, 3)))
            // println(balancedSums(arrayOf(1, 2, 3, 3)))
            // println(balancedSums(arrayOf(1, 1, 4, 1, 1)))
            // println(balancedSums(arrayOf(2, 0, 0, 0)))
            // println(balancedSums(arrayOf(0, 0, 2, 0)))

            println(balancedSums2(arrayOf(5, 6, 8, 1)))
            println(balancedSums2(arrayOf(1, 2, 3)))
            println(balancedSums2(arrayOf(1, 2, 3, 3)))
            println(balancedSums2(arrayOf(1, 1, 4, 1, 1)))
            println(balancedSums2(arrayOf(2, 0, 0, 0)))
            println(balancedSums2(arrayOf(0, 0, 2, 0)))
        }

        // 특정 인덱스를 기준으로 왼쪽과 오른쪽의 합이 같으면 YES, 아니면 NO
        // 시간초과 발생
        private fun balancedSums(arr: Array<Int>): String {
            for (i in arr.indices) {
                val leftSum = arr.slice(0 until i).sum()
                val rightSum = arr.slice(i + 1 until arr.size).sum()
                println("i = $i, arr[i] = ${arr[i]}, left = $leftSum, right = $rightSum")
                if (leftSum == rightSum) {
                    return "YES"
                }
            }
            return "NO"
        }

        // 통과
        private fun balancedSums2(arr: Array<Int>): String {
            var leftSum = 0
            var rightSum = arr.sum() - arr[0]
            if (leftSum == rightSum) {
                return "YES"
            }
            else {
                for (i in 1 until arr.size) {
                    leftSum += arr[i - 1]
                    rightSum -= arr[i]
                    // println("i = $i, arr[i] = ${arr[i]}, left = $leftSum, right = $rightSum")
                    if (leftSum == rightSum) {
                        return "YES"
                    }
                }
            }
            return "NO"
        }
    }
}