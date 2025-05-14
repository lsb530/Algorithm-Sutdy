package hacker_rank.implementation

class Birthday {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(birthday2(s = arrayOf(2, 2, 1, 3, 2), 4, 2)) // [2, 2], [1, 3] => 2
            // println(birthday2(s = arrayOf(1, 2, 1, 3, 2), 3, 2)) // [1, 2], [2, 1] => 2
            // println(birthday2(s = arrayOf(1, 1, 1, 1, 1), 3, 2)) // [] => 0
        }

        private fun birthday(s: Array<Int>, d: Int, m: Int): Int {
            // m개를 뽑아서 합이 d가 되는 경우
            var barCount = 0
            val combos = mutableSetOf<List<Int>>()

            fun divide(startIdx: Int, picked: MutableList<Int>) {
                if (picked.size == m) {
                    if (picked.sum() == d) {
                        // println(picked)
                        // println(picked.sorted())
                        // combos.add(picked)
                        combos.add(picked.sorted())
                        // barCount += 1
                    }
                    return
                }

                for (i in startIdx until s.size) {
                    picked.add(s[i])
                    divide(i + 1, picked)
                    picked.removeAt(picked.size - 1)
                }
            }

            divide(0, mutableListOf())

            println(combos)
            println("barCount = $barCount")

            return combos.size
        }

        private fun birthday2(s: Array<Int>, d: Int, m: Int): Int {
            // 연속된 구간의 합이었음...
            // m개를 연속된 구간에서 뽑아서 합이 d가 되는 경우
            var count = 0

            for (i in 0 .. s.size - m) {
                val subArr = s.slice(i until i + m)
                // println(subArr)
                if (subArr.sum() == d) count++
            }

            return count
        }

    }
}