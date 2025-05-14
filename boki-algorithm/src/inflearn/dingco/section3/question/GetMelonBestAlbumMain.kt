package inflearn.dingco.section3.question

class GetMelonBestAlbumMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                "정답 = [4, 1, 3, 0] / 현재 풀이 값 = ${
                    getMelonBestAlbum(
                        genreArray = arrayOf("classic", "pop", "classic", "classic", "pop"),
                        playArray = arrayOf(500, 600, 150, 800, 2500)
                    )
                }"
            )
            println(
                "정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = ${
                    getMelonBestAlbum(
                        genreArray = arrayOf("hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"),
                        playArray = arrayOf(2000, 500, 600, 150, 800, 2500, 2000)
                    )
                }"
            )
        }

        private fun getMelonBestAlbum(genreArray: Array<String>, playArray: Array<Int>): List<Int>? {
            // key='classic', value=(index, value)
            // map: [
            //          { classic: [0, 500], [2, 150], [3, 800] },
            //          { pop: [1, 600], [4, 2500] }
            //      ]

            // 1. value로 내림차순 정렬(큰 value를 가진 index를 뽑아내기 위함) -> ok
            // 2. key, value:sum을 계산한 새로운 맵 만들기. 그리고 sum이 큰 순서대로 list에 이름 key 집어넣기 -> ok
            // 3. list에 있는 key 순서대로 map에서 value list를 앞에서 2개씩 뽑아내기(1번에서 이미 정렬함)
            val genrePlayCountMap = mutableMapOf<String, MutableList<Pair<Int, Int>>>()
            for (i in 0..<genreArray.size) {
                if (genrePlayCountMap[genreArray[i]] == null) {
                    genrePlayCountMap[genreArray[i]] = mutableListOf()
                }
                genrePlayCountMap[genreArray[i]]!!.add(Pair(i, playArray[i]))
            }
            // println(genrePlayCountMap)
            genrePlayCountMap.values.forEach { it.sortByDescending { it.second } }
            // println(genrePlayCountMap)

            val genrePlaySumMap = mutableMapOf<String, Int>()
            for (i in 0..<genreArray.size) {
                if (genrePlaySumMap[genreArray[i]] == null) {
                    genrePlaySumMap[genreArray[i]] = playArray[i]
                } else {
                    genrePlaySumMap[genreArray[i]] = genrePlaySumMap[genreArray[i]]!! + playArray[i]
                }
            }
            // println(genrePlaySumMap)

            val sortedBySumPlayedCountMap = genrePlaySumMap.toList()
                .sortedByDescending { it.second }
                .toMap()
            // println(sortedBySumPlayedCountMap)

            val answer = mutableListOf<Int>()
            for ((key, v) in sortedBySumPlayedCountMap) {
                for (i in 0..<2) {
                    answer.add(genrePlayCountMap[key]!![i].first)
                }
            }
            return answer
        }
    }
}