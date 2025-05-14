package hacker_rank.strings

class MarsExploration {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(marsExploration("SOSSPSSQSSOR")) // 3
            println(marsExploration("SOSSOT")) // 1
            println(marsExploration("SOSSOSSOS")) // 0

            println(marsExploration2("SOSSPSSQSSOR")) // 3
            println(marsExploration2("SOSSOT")) // 1
            println(marsExploration2("SOSSOSSOS")) // 0
        }

        fun marsExploration(s: String): Int {
            val helpMsg = "SOS"
            var difference = 0
            for (i in 0..<s.length step 3) {
                // println("s[i] = ${s[i]}, s[i+1] = ${s[i + 1]}, s[i+2] = ${s[i + 2]}")
                if (s[i] != helpMsg[0]) difference += 1
                if (s[i + 1] != helpMsg[1]) difference += 1
                if (s[i + 2] != helpMsg[2]) difference += 1
            }
            return difference
        }

        private fun marsExploration2(s: String): Int {
            val helpMsg = "SOS"
            return s.indices.count { idx ->
                s[idx] != helpMsg[idx % 3]
            }
        }
    }
}