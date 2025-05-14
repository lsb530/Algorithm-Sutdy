package inflearn.dingco.section2.question

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

    fun getKthNodeFromLast(k: Int): Int {
        var slow: Node? = this.head
        var fast: Node? = this.head

        for (i in 0..<k) {
            fast = fast?.next
        }

        while (fast != null) {
            slow = slow?.next
            fast = fast.next
        }

        return slow!!.data
    }
}

class GetKthNodeFromLastMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val linkedList = LinkedList(6)
            linkedList.append(7)
            linkedList.append(8)

            println(linkedList.getKthNodeFromLast(2)) // 7
        }
    }
}