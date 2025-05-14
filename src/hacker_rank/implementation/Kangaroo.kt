package hacker_rank.implementation

class Kangaroo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // println(kangaroo2(2, 1, 1, 2))
            // println(kangaroo2(0, 3, 4, 2))
            // println(kangaroo2(14, 4, 98, 2))
            // println(kangaroo2(0, 2, 5, 3))

            println(kangaroo3(2, 1, 1, 2))
            println(kangaroo3(0, 3, 4, 2))
            println(kangaroo3(14, 4, 98, 2))
            println(kangaroo3(0, 2, 5, 3))
        }

        private fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
            val jumpArr = Array(20001) { false }
            // println(jumpArr.contentToString())
            var jumpPosition = x1
            for (i in 0..<20_000) {
                jumpPosition += v1
                jumpArr[jumpPosition] = true
            }
            jumpPosition = x2
            for (j in 0..<20_000) {
                jumpPosition += v2
                if (jumpArr[jumpPosition]) return "YES"
            }
            return "NO"
        }

        private fun kangaroo2(x1: Int, v1: Int, x2: Int, v2: Int): String {
            val set = mutableSetOf<Int>()
            var jumpPositionX1 = x1
            for (i in 0..10_000) {
                jumpPositionX1 += v1
                set.add(jumpPositionX1)
            }

            var jumpPositionX2 = x2
            for (i in 0..10_000) {
                jumpPositionX2 += v2
                if (jumpPositionX2 in set)
                    return "YES"
            }
            return "NO"
        }

        // 여기가 정답
        private fun kangaroo3(x1: Int, v1: Int, x2: Int, v2: Int): String {
            val map = mutableMapOf<Int, Int>()
            var jumpPositionX1 = x1
            for (i in 0..10_000) {
                jumpPositionX1 += v1
                map[i] = jumpPositionX1
            }

            var jumpPositionX2 = x2
            for (i in 0..10_000) {
                jumpPositionX2 += v2
                if (map[i] == jumpPositionX2)
                    return "YES"
            }
            return "NO"
        }
    }
}