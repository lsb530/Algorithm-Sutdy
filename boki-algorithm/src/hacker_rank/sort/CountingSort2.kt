package hacker_rank.sort

class CountingSort2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            countingSort2(arrayOf(1, 1, 3, 2, 1))
        }

        private fun countingSort2(arr: Array<Int>): Array<Int> {
            val countArr = Array(100) { 0 }
            for (x in arr) {
                countArr[x] += 1
            }
            val resultList = mutableListOf<Int>()
            for (i in countArr.indices) {
                if (countArr[i] == 0) continue
                while (countArr[i]-- > 0) {
                    resultList.add(i)
                }
            }
            // println(resultList)
            return resultList.toTypedArray()
        }
    }
}