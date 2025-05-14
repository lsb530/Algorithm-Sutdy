package inflearn.dingco.section3.stack

import java.util.ArrayDeque

class GetReceiverTopOrdersStackMain {
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

        private fun getReceiverTopOrders(arr: IntArray): IntArray {
            val answer = Array(arr.size) { 0 }
            val stack = ArrayDeque(arr.toList().reversed())
            while (stack.isNotEmpty()) {
                val current = stack.pop()
                for (i in stack.size - 1 downTo 0) {
                    // println("stack.pop=$current, i=$i, arr[i]=${arr[i]}")
                    if (current < arr[i]) {
                        answer[stack.size] = i + 1
                        break
                    }
                }
            }
            return answer.toIntArray()
        }
    }
}