package hacker_rank.search

class MissingNumbers {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(missingNumbers(
                arrayOf(7, 2, 5, 3, 5, 3), arrayOf(7, 2, 5, 4, 6, 3, 5, 3)).joinToString(" ")
            )
            println(missingNumbers(
                arrayOf(203, 204, 205, 206, 207, 208, 203, 204, 205, 206),
                arrayOf(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)
            ).joinToString(" "))
        }

        private fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
            val answer = mutableSetOf<Int>()
            val cntMap1 = mutableMapOf<Int, Int>()
            val cntMap2 = mutableMapOf<Int, Int>()
            for (x in arr)
                cntMap1[x] = cntMap1[x]?.plus(1) ?: 1
            for (x in brr)
                cntMap2[x] = cntMap2[x]?.plus(1) ?: 1
            for (x in brr) {
                if (cntMap1[x] == cntMap2[x]) {
                    continue
                }
                answer.add(x)
            }
            return answer.sorted().toTypedArray()
        }
    }
}