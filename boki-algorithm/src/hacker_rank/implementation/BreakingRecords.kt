package hacker_rank.implementation

class BreakingRecords {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val result = breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42))
            println(result.contentToString())

            val result2 = breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1))
            println(result2.contentToString())
        }

        private fun breakingRecords(scores: Array<Int>): Array<Int> {
            val scoreList = scores.toMutableList()
            var highScore = scoreList[0]
            var lowScore = scoreList[0]

            var highestScoreCount = 0
            var lowestScoreCount = 0

            for (i in 1 until scoreList.size) {
                if (scoreList[i] > highScore) {
                    highScore = scoreList[i]
                    highestScoreCount++
                }
                if (scoreList[i] < lowScore) {
                    lowScore = scoreList[i]
                    lowestScoreCount++
                }
            }
            return arrayOf(highestScoreCount, lowestScoreCount)
        }
    }
}