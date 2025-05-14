package inflearn.dingco.section3.stack

class GetReceiverTopOrdersMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                "정답 = [0, 0, 2, 2, 4] / 현재 풀이 값 = ${
                    getReceiverTopOrders(
                        intArrayOf(
                            6,
                            9,
                            5,
                            7,
                            4
                        )
                    ).contentToString()
                }"
            )
            println(
                "정답 = [0, 0, 0, 3, 3, 3, 6] / 현재 풀이 값 = ${
                    getReceiverTopOrders(
                        intArrayOf(
                            3,
                            9,
                            9,
                            3,
                            5,
                            7,
                            2
                        )
                    ).contentToString()
                }"
            )
            println(
                "정답 = [0, 0, 2, 0, 0, 5, 6] / 현재 풀이 값 = ${
                    getReceiverTopOrders(
                        intArrayOf(
                            1,
                            5,
                            3,
                            6,
                            7,
                            6,
                            5
                        )
                    ).contentToString()
                }"
            )
        }

        // 0 1 2 3 4
        // 0 1 2 3
        // 0 1 2
        // 0 1
        // 0
        private fun getReceiverTopOrders(arr: IntArray): IntArray? {
            val answer = Array(arr.size) { 0 }
            for (i in arr.size - 1 downTo 1) {
                for (j in i - 1 downTo 0) {
                    // println("$i $j")
                    if (arr[i] <= arr[j]) {
                        answer[i] = j + 1
                        break
                    }
                }
                // println()
            }
            return answer.toIntArray()
        }
    }
}