package inflearn.dingco.section4.bfs_dfs

import java.util.ArrayDeque

class DfsStackMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val graph = mutableMapOf<Int, List<Int>>()
            graph[1] = listOf(2, 5, 9); graph[2] = listOf(1, 3); graph[3] = listOf(2, 4)
            graph[4] = listOf(3); graph[5] = listOf(1, 6, 8); graph[6] = listOf(5, 7)
            graph[7] = listOf(6); graph[8] = listOf(5); graph[9] = listOf(1, 10)
            graph[10] = listOf(9)

            print(dfsStack(graph, 1))
            // [1, 9, 10, 5, 8, 6, 7, 2, 3, 4] 이 출력되어야 합니다!
        }

        private fun dfsStack(graph: MutableMap<Int, List<Int>>, startNode: Int): List<Int> {
            val stack = ArrayDeque<Int>()
            stack.push(startNode)
            val visited = mutableListOf<Int>()

            while (stack.isNotEmpty()) {
                val currentNode = stack.pop()
                visited.add(currentNode)

                for (adjNode in graph[currentNode]!!) {
                    if (adjNode !in visited) {
                        stack.push(adjNode)
                    }
                }
            }
            return visited
        }
    }
}