package hacker_rank.strings


class Alternate {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(alternate("abaacdabd")) // 4
            println(alternate("beabeefeab")) // 5
            println(alternate("asdcbsdcagfsdbgdfanfghbsfdab")) // 8
            println(alternate("asvkugfiugsalddlasguifgukvsa")) // 0
        }

        private fun hasConsecutiveChar(str: String): Boolean {
            for (i in 1 until str.length) {
                if (str[i] == str[i - 1])
                    return true
            }
            return false
        }

        private fun alternate(s: String): Int {
            val uniqueChars = s.toSet().toList()
            // println(uniqueChars)

            var maxLength = 0

            for (i in uniqueChars.indices) {
                for (j in i + 1 until uniqueChars.size) {
                    val c1 = uniqueChars[i]
                    val c2 = uniqueChars[j]

                    val filtered = s.filter { it == c1 || it == c2 }
                    // println("c1: $c1, c2: $c2, filtered: $filtered")

                    if (!hasConsecutiveChar(filtered)) {
                        maxLength = maxOf(maxLength, filtered.length)
                    }
                }
            }

            return maxLength
        }

        private fun alternate2(s: String): Int {
            val set = mutableSetOf<List<Char>>()
            for (i in s) {
                for (j in s) {
                    if (i != j) {
                        val pair = listOf(i, j).sorted()
                        set.add(pair)
                    }
                }
            }
            println(set)
            val pickTwoLetterList = set.toList()
            val alterNativeNonConsecutiveStr = pickTwoLetterList
                .map {
                    val filteredStr = s.replace(it[0].toString(), "")
                    .replace(it[1].toString(), "")
                    println(filteredStr)
                    filteredStr
            }.filter { !hasConsecutiveChar(it) }
                .maxBy { it.length }
            println(alterNativeNonConsecutiveStr)
            return alterNativeNonConsecutiveStr.length
        }
    }
}