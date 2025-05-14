package inflearn.dingco.section1

class FindNotRepeatingFirstCharacterMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("정답 = d 현재 풀이 값 = ${findNotRepeatingFirstCharacter("abadabac")}")
            println("정답 = c 현재 풀이 값 = ${findNotRepeatingFirstCharacter("aabbcddd")}")
            println("정답 = _ 현재 풀이 값 = ${findNotRepeatingFirstCharacter("aaaaaaaa")}")
        }

        private fun findNotRepeatingFirstCharacter(str: String): Char {
            val map = LinkedHashMap<Char, Int>()
            for(ch in str) {
                map[ch] = (map[ch] ?: 0) + 1
            }
            for((k, v) in map) {
                if (v == 1)
                    return k
            }
            return '_'
        }
    }

}