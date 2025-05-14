package hacker_rank.strings

class Camelcase {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(camelcase("oneTwoThree")) // 3
            println(camelcase("saveChangesInTheEditor")) // 5
        }

        private fun camelcase(s: String): Int {
            var answer = 1
            for (x in s) {
                if (x.isUpperCase()) answer += 1
            }
            return answer
        }
    }
}