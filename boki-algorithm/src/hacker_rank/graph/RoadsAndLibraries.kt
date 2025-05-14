package hacker_rank.graph

class RoadsAndLibraries {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // println(roadsAndLibrariesUF(3, 2, 1,
            //     arrayOf(
            //             arrayOf(1, 2),
            //             arrayOf(3, 1),
            //             arrayOf(2, 3)
            //         )
            //     )
            // )
            // println(roadsAndLibrariesUF(6, 2, 5,
            //     arrayOf(
            //             arrayOf(1, 3),
            //             arrayOf(3, 4),
            //             arrayOf(2, 4),
            //             arrayOf(1, 2),
            //             arrayOf(2, 3),
            //             arrayOf(5, 6)
            //         )
            //     )
            // )

            println(roadsAndLibrariesBFS(3, 2, 1,
                arrayOf(
                        arrayOf(1, 2),
                        arrayOf(3, 1),
                        arrayOf(2, 3)
                    )
                )
            )
            println(roadsAndLibrariesBFS(6, 2, 5,
                arrayOf(
                        arrayOf(1, 3),
                        arrayOf(3, 4),
                        arrayOf(2, 4),
                        arrayOf(1, 2),
                        arrayOf(2, 3),
                        arrayOf(5, 6)
                    )
                )
            )
        }

        private fun roadsAndLibrariesUF(n: Int, c_lib: Int, c_road: Int, cities: Array<Array<Int>>): Long {
            // 라이브러리를 만드는 것보다 도로를 만드는 비용이 같거나 크면, 라이브러리를 만드는 게 이득
            if (c_lib <= c_road) {
                return n.toLong() * c_lib
            }

            val parent = IntArray(n + 1) { it }
            val rank = IntArray(n + 1) { 0 }

            fun find(x: Int): Int {
                if (parent[x] != x) {
                    parent[x] = find(parent[x])
                }
                return parent[x]
            }

            fun union(a: Int, b: Int) {
                val rootA = find(a)
                val rootB = find(b)
                if (rootA != rootB) {
                    // rank 기준으로 붙이기(무거운 트리에 가벼운 트리 붙이기)
                    if (rank[rootA] < rank[rootB]) {
                        parent[rootA] = rootB
                    } else if (rank[rootA] > rank[rootB]) {
                        parent[rootB] = rootA
                    } else {
                        parent[rootB] = rootA
                        rank[rootA]++
                    }
                }
            }

            // 주어진 간선 정보로 union 수행
            for ((u, v) in cities) {
                union(u, v)
            }

            // 각 컴포넌트(루트별)로 몇 개의 노드가 속했는지 계산
            val componentSize = mutableMapOf<Int, Int>()
            for (city in 1..n) {
                val root = find(city)
                componentSize[root] = componentSize.getOrDefault(root, 0) + 1
            }

            var totalCost = 0L
            // 각 연결 컴포넌트마다 라이브러리 1개 + 도로 k-1개 비용
            for ((_, size) in componentSize) {
                totalCost += c_lib + (size - 1L) * c_road
            }

            return totalCost
        }

        // 연결된 간선마다 최소한 한개 이상의 도서관 건설
        fun roadsAndLibrariesBFS(n: Int, c_lib: Int, c_road: Int, cities: Array<Array<Int>>): Long {
            if (c_lib <= c_road) {
                return n.toLong() * c_lib
            }

            val graph = MutableList(n + 1) { mutableListOf<Int>() }
            for ((u, v) in cities) {
                // println("u = $u, v = $v")
                graph[u].add(v)
                graph[v].add(u)
            }

            // println(graph.slice(1..graph.size - 1).joinToString(" "))

            val visited = BooleanArray(n + 1)
            var totalCost = 0L

            for (city in 1..n) {
                // println("city = $city")
                // println(visited.joinToString(" "))
                if (!visited[city]) {
                    val size = bfs(graph, city, visited)
                    // println("size = $size")
                    // component cost: c_lib + (size - 1) * c_roads
                    totalCost += c_lib + (size - 1L) * c_road
                }
                // println(visited.joinToString(" "))
            }
            return totalCost
        }

        private fun bfs(graph: List<List<Int>>, start: Int, visited: BooleanArray): Int {
            // println("bfs")
            val queue = ArrayDeque<Int>()
            queue.add(start)
            visited[start] = true

            var count = 0
            while (queue.isNotEmpty()) {
                val node = queue.removeFirst()
                // println("node = $node")
                count++
                for (next in graph[node]) {
                    if (!visited[next]) {
                        visited[next] = true
                        queue.add(next)
                    }
                }
            }
            // println("count = $count")
            return count
        }
    }
}