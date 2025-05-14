package inflearn.dingco.section4.bfs_dfs

import java.util.ArrayDeque

class BfsQueueMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val graph = mutableMapOf<Int, List<Int>>()
            graph[1] = listOf(2, 3, 4); graph[2] = listOf(1, 5); graph[3] = listOf(1, 6, 7)
            graph[4] = listOf(1, 8); graph[5] = listOf(2, 9); graph[6] = listOf(3, 10)
            graph[7] = listOf(3); graph[8] = listOf(4); graph[9] = listOf(5)
            graph[10] = listOf(6)

            print(bfsQueue(graph, 1))
            // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 이 출력되어야 합니다!
        }

        // 1. 시작 노드를 큐에 추가
        // 2. 현재 큐의 노드를 빼서 visited에 추가
        // 3. 현재 방문한 노드와 인접한 노드 중 방문하지 않은 노드를 큐에 추가
        // 2~3의 과정을 큐가 빌때까지 반복
        private fun bfsQueue(adjacentGraph: Map<Int, List<Int>>, startNode: Int): MutableList<Int> {
            val queue = ArrayDeque<Int>()
            queue.offer(startNode)
            val visited = mutableListOf<Int>()

            while (queue.isNotEmpty()) {
                val currentNode = queue.poll()
                visited.add(currentNode)
                for (adjNode in adjacentGraph[currentNode]!!) {
                    if (adjNode !in visited) {
                        queue.offer(adjNode)
                    }
                }
            }

            return visited
        }
    }
}