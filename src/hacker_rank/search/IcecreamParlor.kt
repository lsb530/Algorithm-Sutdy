package hacker_rank.search

class IcecreamParlor {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(icecreamParlor(6, arrayOf(1, 3, 4, 5, 6)).joinToString(" "))
            println(icecreamParlor(4, arrayOf(1, 4, 5, 3, 2)).joinToString(" "))
            println(icecreamParlor(4, arrayOf(2, 2, 4, 3)).joinToString(" "))
        }

        private fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
            val answer = Array(2) { 0 }
            for (i in 0 until arr.size) {
                for (j in i + 1 until arr.size) {
                    if (arr[i] + arr[j] == m) {
                        if (i < j) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                        } else {
                            answer[0] = j + 1;
                            answer[1] = i + 1;
                        }
                    }
                }
            }
            return answer;
        }
    }
}