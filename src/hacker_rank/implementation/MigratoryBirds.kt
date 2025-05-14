package hacker_rank.implementation

class MigratoryBirds {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(migratoryBirds(arrayOf(1, 1, 2, 2, 3))) // 1
            println(migratoryBirds(arrayOf(1, 4, 4, 4, 5, 3))) // 4
            println(migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))) // 3
        }

        // 가장 많이 등장한 숫자, 갯수가 겹치면 작은 순서대로
        private fun migratoryBirds(arr: Array<Int>): Int {
            val countMap = mutableMapOf<Int, Int>()
            for (x in arr) {
                countMap[x] = countMap.getOrDefault(x, 0) + 1
            }
            val sortedDescMap = countMap.toList().sortedByDescending { it.second }.toMap()
            val maxValue = sortedDescMap.toList()[0].second
            val filteredMap = sortedDescMap.filterValues { it == maxValue }
            return filteredMap.toList().sortedBy { it.first }.toList()[0].first
        }

    }
}