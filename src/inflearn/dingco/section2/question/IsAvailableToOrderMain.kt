package inflearn.dingco.section2.question

class IsAvailableToOrderMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                isAvailableToOrder(
                    menus = listOf("만두", "떡볶이", "오뎅", "사이다", "콜라"),
                    orders = listOf("오뎅", "콜라", "만두")
                )
            )
        }

        private fun isAvailableToOrder(menus: List<String>, orders: List<String>): Boolean {
            val menuSet = menus.toSet()
            for (order in orders) {
                if (!menuSet.contains(order))
                    return false
            }
            return true
        }
    }
}