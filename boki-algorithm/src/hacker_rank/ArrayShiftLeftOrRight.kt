package hacker_rank

class ArrayShiftLeftOrRight {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val intArr = intArrayOf(1, 2, 3, 4, 5)

            shiftRightBy(intArr, 1)
            shiftRightBy(intArr, 2)
            shiftRightBy(intArr, 3)

            println()

            shiftLeftBy(intArr, 1)
            shiftLeftBy(intArr, 2)
            shiftLeftBy(intArr, 3)
        }

        // 우측으로 밀기: newArr[i] = arr[(i - k + n) mod n]
        private fun shiftRightBy(intArr: IntArray, k: Int) {
            print("original: ${intArr.contentToString()} -> ")
            val rotatedArr = IntArray(intArr.size)
            for (i in intArr.indices) {
                rotatedArr[i] = intArr[(i - k + intArr.size) % intArr.size]
            }
            println("shifted right by $k: ${rotatedArr.contentToString()}")
        }

        // 좌측으로 밀기: newArr[i] = arr[(i + k) mod n]
        private fun shiftLeftBy(intArr: IntArray, k: Int) {
            print("original: ${intArr.contentToString()} -> ")
            val rotatedArr = IntArray(intArr.size)
            for (i in intArr.indices) {
                rotatedArr[i] = intArr[(i + k) % intArr.size]
            }
            println("shifted left by $k: ${rotatedArr.contentToString()}")
        }
    }
}