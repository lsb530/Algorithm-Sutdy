package inflearn.dingco.section4.question

import java.util.ArrayDeque

class GetCountOfDepartmentsCleanedByRobotVacuumMain {

    companion object {

        // 북 동 남 서
        private val dr = arrayOf(-1, 0, 1, 0)
        private val dc = arrayOf(0, 1, 0, -1)

        //    북(0)
        // 서(3)  동(1)
        //    남(2)

        // 왼쪽으로 회전
        private fun rotateLeft(d: Int): Int = (d + 3) % 4

        // 뒤로 후진
        private fun goBack(d: Int): Int = (d + 2) % 4

        @JvmStatic
        fun main(args: Array<String>) {
            val currentRoomMap = arrayOf(
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 1, 1, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 1, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )
            println("정답 = 57 / 현재 풀이 값 = ${getCountOfDepartmentsCleanedByRobotVacuum(7, 4, 0, currentRoomMap)}")

            val currentRoomMap2 = arrayOf(
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 1, 1, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 1, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )
            println("정답 = 29 / 현재 풀이 값 = ${getCountOfDepartmentsCleanedByRobotVacuum(6, 3, 1, currentRoomMap2)}")

            val currentRoomMap3 = arrayOf(
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 1, 1, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 1, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )
            println("정답 = 33 / 현재 풀이 값 = ${getCountOfDepartmentsCleanedByRobotVacuum(7, 4, 1, currentRoomMap3)}")

            val currentRoomMap4 = arrayOf(
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 1, 0, 1, 1, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 1, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 1, 1, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 1, 0, 0, 1, 1, 0, 1),
                intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
            )
            println("정답 = 25 / 현재 풀이 값 = ${getCountOfDepartmentsCleanedByRobotVacuum(6, 2, 0, currentRoomMap4)}")

        }

        private fun getCountOfDepartmentsCleanedByRobotVacuum(
            startRow: Int,
            startCol: Int,
            startDir: Int,
            roomMap: Array<IntArray>
        ): Int {
            val N = roomMap.size
            val M = roomMap[0].size

            var cleanedCount = 1
            roomMap[startRow][startCol] = 2

            val visitQueue = ArrayDeque<Triple<Int, Int, Int>>()
            visitQueue.offer(Triple(startRow, startCol, startDir))

            while (visitQueue.isNotEmpty()) {
                val (curRow, curCol, curDir) = visitQueue.poll()
                var tempDir = curDir

                for (i in 0 until 4) {
                    tempDir = rotateLeft(tempDir)
                    val nextRow = curRow + dr[tempDir]
                    val nextCol = curCol + dc[tempDir]

                    // 미청소 공간(0)이면 청소 후 큐에 넣고 반복 종료
                    if (
                        nextRow in 0 until N &&
                        nextCol in 0 until M &&
                        roomMap[nextRow][nextCol] == 0
                    ) {
                        cleanedCount++
                        roomMap[nextRow][nextCol] = 2
                        visitQueue.offer(Triple(nextRow, nextCol, tempDir))
                        break
                    }

                    // 왼쪽 방향부터 3번 모두 이동 불가하면, 마지막 4번째 반복 후 뒤로 이동 시도
                    else if (i == 3) {
                        val backDir = goBack(curDir)
                        val backRow = curRow + dr[backDir]
                        val backCol = curCol + dc[backDir]

                        // 뒤가 벽이면 종료
                        if (roomMap[backRow][backCol] == 1) {
                            return cleanedCount
                        }

                        // 뒤로 이동 가능하면 후진
                        visitQueue.offer(Triple(backRow, backCol, curDir))
                    }
                }
            }
            return cleanedCount
        }
    }
}