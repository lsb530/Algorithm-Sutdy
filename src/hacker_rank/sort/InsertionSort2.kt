package hacker_rank.sort

class InsertionSort2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            insertionSort2(7, arrayOf(3, 4, 7, 5, 6, 2, 1))
            insertionSort2(6, arrayOf(1, 4, 3, 5, 6, 2))
        }

        // 1. 왼쪽에서 오른쪽으로
        // 2. a[1]을 픽하고 이전 인덱스들과 비교하며 진행(내부 반복)
        // 3. for와 while을 같이 활요앟면 될듯
        // 4. 왼쪽에서 자기보다 큰 값이 나올때까지 탐색
        // 5. 값을 오른쪽으로 밀면서 업데이트
        // 6. while이 끝난 다음의 업데이트 된 값을 이용하여 빈곳에 값 추가
        private fun insertionSort2(n: Int, arr: Array<Int>) {
            for (i in 1 until n) {
                val pick = arr[i]
                // println("pick: $pick")

                var j = i - 1
                while (j >= 0 && arr[j] > pick) {
                    arr[j + 1] = arr[j]
                    j--
                    // println(arr.joinToString(" "))
                }
                arr[j + 1] = pick

                println(arr.joinToString(" "))
            }
        }
        /*
            3 4 7 5 6 2 1
            3 4 7 5 6 2 1
            3 4 5 7 6 2 1
            3 4 5 6 7 2 1
            2 3 4 5 6 7 1
            1 2 3 4 5 6 7
         */
    }
}