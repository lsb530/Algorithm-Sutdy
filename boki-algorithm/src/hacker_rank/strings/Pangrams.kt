package hacker_rank.strings

class Pangrams {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(pangrams("We promptly judged antique ivory buckles for the next prize"))
            println(pangrams("We promptly judged antique ivory buckles for the prize"))
        }

        private fun pangrams(s: String): String {
            val alphabetVisitedArray = Array(26) { false }
            // println(alphabetVisitedArray.contentToString())
            for (c in s.lowercase()) {
                if (c.isLetter()) {
                    alphabetVisitedArray[c - 'a'] = true
                }
            }
            for (i in alphabetVisitedArray.indices) {
                if (!alphabetVisitedArray[i]) {
                    return "not pangram"
                }
            }
            return "pangram"
        }
    }
}