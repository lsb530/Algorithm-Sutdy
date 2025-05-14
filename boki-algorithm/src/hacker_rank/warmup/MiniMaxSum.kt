package hacker_rank.warmup

class MiniMaxSum {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // MeasureTimeUtil.measureExecuteTime { miniMaxSum1(arrayOf(1, 3, 5, 7, 9)) }

            miniMaxSum1(arrayOf(1, 3, 5, 7, 9))
            miniMaxSum1(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))

            miniMaxSum2(arrayOf(1, 3, 5, 7, 9))
            miniMaxSum2(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))

            miniMaxSum3(arrayOf(1, 3, 5, 7, 9))
            miniMaxSum3(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
        }

        fun miniMaxSum1(arr: Array<Int>): Unit {
            val sortedArrAsc = arr.sortedArray() // O(NlogN)
            val sortedArrDesc = arr.sortedArrayDescending() // O(NlogN)
            var min = 0L
            var max = 0L
            for (i in 0 until sortedArrAsc.lastIndex) min += sortedArrAsc[i] // O(N-1)
            for (i in 0 until sortedArrDesc.lastIndex) max += sortedArrDesc[i] // O(N-1)
            println("$min $max")
        }

        fun miniMaxSum2(arr: Array<Int>): Unit {
            // arr: [1,9,5,7,3]
            val sumSet = mutableSetOf<Long>()

            // arr.size - 1개를 뽑아서 재귀적으로 sumSet에 합을 넣는 함수
            fun pickNumbers(startIndex: Int, currentList: MutableList<Long>) {
                // 원하는 개수(여기서는 arr.size - 1)를 뽑았을 때 합을 sumSet에 추가
                if (currentList.size == arr.size - 1) {
                    // println(currentList)
                    sumSet.add(currentList.sum())
                    return
                }

                // 재귀적으로 숫자를 뽑아나감
                for (i in startIndex until arr.size) {
                    currentList.add(arr[i].toLong())
                    pickNumbers(i + 1, currentList)
                    currentList.removeAt(currentList.size - 1) // 백트래킹
                }
            }

            // 재귀 함수 호출
            pickNumbers(0, mutableListOf())

            // println(sumSet)

            println("${sumSet.min()} ${sumSet.max()}")
        }

        fun miniMaxSum3(arr: Array<Int>): Unit {
            // val totalSum = arr.sum().toLong()
            val totalSum = arr.sumOf { it.toLong() }
            val min = totalSum - arr.max()
            val max = totalSum - arr.min()
            println("$min $max")
        }
    }
}