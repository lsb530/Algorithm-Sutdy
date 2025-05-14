package inflearn.dingco.section4.bfs_dfs

class DfsRecursionMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val graph = mutableMapOf<Int, List<Int>>()
            graph[1] = listOf(2, 5, 9); graph[2] = listOf(1, 3); graph[3] = listOf(2, 4)
            graph[4] = listOf(3); graph[5] = listOf(1, 6, 8); graph[6] = listOf(5, 7)
            graph[7] = listOf(6); graph[8] = listOf(5); graph[9] = listOf(1, 10)
            graph[10] = listOf(9)

            val visited = mutableListOf<Int>()
            dfsRecursion(graph, 1, visited)
            println(visited) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 이 출력되어야 합니다!
        }

        // 1. 시작 노드인 1부터 탐색
        // 2. 현재 방문한 노드를 visited_array에 추가
        // 3. 현재 방문한 노드와 인접한 노드 중 방문하지 않은 노드를 방문
        private fun dfsRecursion(adjacentGraph: Map<Int, List<Int>>, curNode: Int, visited: MutableList<Int>) {
            visited.add(curNode)
            for (adjNode in adjacentGraph[curNode]!!) {
                if (adjNode !in visited) {
                    dfsRecursion(adjacentGraph, adjNode, visited)
                }
            }
        }
    }
}