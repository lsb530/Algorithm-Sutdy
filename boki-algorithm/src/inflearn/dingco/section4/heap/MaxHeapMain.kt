package inflearn.dingco.section4.heap

class MaxHeapMain {
    class MaxHeap {
        val items: MutableList<Int?> = mutableListOf()

        init {
            this.items.add(null)
        }

        // 1. 맨 마지막에 원소 추가 & 현재 인덱스 구하기
        // 2. 부모 노드와 비교해서 자리 변경 & 인덱스 변경
        fun insert(value: Int) {
            this.items.add(value)
            var currentIndex = this.items.size - 1

            while (currentIndex != 1) {
                val parentIndex = currentIndex / 2

                if (this.items[currentIndex]!! > this.items[parentIndex]!!) {
                    this.items[currentIndex] = this.items[parentIndex]
                        .also { this.items[parentIndex] = this.items[currentIndex] }
                        .also { currentIndex = parentIndex }
                } else {
                    break
                }
            }
        }

        // 0. 항상 맨 위의 루트 노드가 삭제됨
        // 1. 루트 노드와 맨 끝에 있는 원소 교체
        // 2. 맨 뒤에 있는 원소(원래의 루트 노드) 삭제 -> 반환
        // 3. heapify
        // 4. root노드부터 부모와 왼쪽 자식, 부모와 오른쪽 자식을 비교 후 더 큰 값이 부모와 교체
        // 5. 하위도 반복
        fun delete(): Int {
            this.items[1] = this.items[this.items.size - 1].also { this.items[this.items.size - 1] = this.items[1] }
            val prevMax = this.items.removeLast()!!
            var curIndex = 1

            while (curIndex < this.items.size) {
                val leftChildIndex = curIndex * 2
                val rightChildIndex = curIndex * 2 + 1
                var maxIndex = curIndex

                if (leftChildIndex < this.items.size && this.items[leftChildIndex]!! > this.items[maxIndex]!!) {
                    maxIndex = leftChildIndex
                }

                if (rightChildIndex < this.items.size && this.items[rightChildIndex]!! > this.items[maxIndex]!!) {
                    maxIndex = rightChildIndex
                }

                if (maxIndex == curIndex) {
                    break
                }

                this.items[curIndex] = this.items[maxIndex].also { this.items[maxIndex] = this.items[curIndex] }
                curIndex = maxIndex
            }

            return prevMax
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val maxHeap = MaxHeap()
            maxHeap.insert(8)
            maxHeap.insert(6)
            maxHeap.insert(7)
            maxHeap.insert(2)
            maxHeap.insert(5)
            maxHeap.insert(4)
            println(maxHeap.items)  // [null, 8, 6, 7, 2, 5, 4]
            println(maxHeap.delete())  // 8 을 반환해야 합니다!
            println(maxHeap.items)  // [null, 7, 6, 4, 2, 5]
        }
    }
}