package hacker_rank.strings

class HackerrankInString {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(hackerrankInString("hereiamstackerrank")) // YES
            println(hackerrankInString("hackerworld")) // NO
            println(hackerrankInString("hhaacckkekraraannk")) // YES
            println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt")) // NO
        }

        private fun hackerrankInString(s: String): String {
            var i = 0
            val findStr = "hackerrank"
            for (c in s) {
                if (c == findStr[i]) i += 1
                if (i == findStr.length) return "YES"
            }
            return "NO"
        }
    }
}