package hacker_rank.sort

import java.math.BigInteger

class BigSorting {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(bigSorting2(arrayOf("6", "31415926535897932384626433832795", "1", "3", "10", "3")))
            println(
                bigSorting2(
                    arrayOf(
                        "8",
                        "1",
                        "2",
                        "100",
                        "12303479849857341718340192371",
                        "3084193741082937",
                        "3084193741082938",
                        "111",
                        "200"
                    )
                )
            )
        }

        // Timeout
        private fun bigSorting(unsorted: Array<String>): Array<String> {
            val resultList = mutableListOf<BigInteger>()
            for (i in unsorted.indices) {
                resultList.add(unsorted[i].toBigInteger())
            }
            // println(resultList.sorted())
            return resultList.sorted().map { it.toString() }.toTypedArray()
        }

        // Timeout
        private fun bigSorting2(unsorted: Array<String>): Array<String> {
            val answer = unsorted.sortedWith { a, b ->
                if (a.length != b.length) {
                    // 더 길이가 긴 게 큰거
                    a.length - b.length
                }
                else { // 오름차순
                    a.compareTo(b)
                }
            }
            // println(answer)
            return answer.toTypedArray()
        }
    }
}