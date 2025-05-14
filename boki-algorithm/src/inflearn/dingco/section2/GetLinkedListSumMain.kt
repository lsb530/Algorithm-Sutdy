package inflearn.dingco.section2

class GetLinkedListSumMain {

    class Node(val data: Int, var next: Node? = null)

    class LinkedList(data: Int) {
        val head = Node(data)

        fun append(data: Int) {
            var cur = this.head
            while (cur.next != null) {
                cur = cur.next!!
            }
            cur.next = Node(data)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val linkedList1 = LinkedList(6)
            linkedList1.append(7)
            linkedList1.append(8)

            val linkedList2 = LinkedList(3)
            linkedList2.append(5)
            linkedList2.append(4)

            val result = getSingleLinkedListSum(linkedList1) + getSingleLinkedListSum(linkedList2)
            println(result)
        }

        private fun getSingleLinkedListSum(linkedList: LinkedList): Int {
            var sum = 0
            var cur: Node? = linkedList.head
            while (cur != null) {
                sum = sum * 10 + cur.data
                cur = cur.next
            }
            return sum
        }
    }
}