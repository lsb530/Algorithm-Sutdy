package hacker_rank

import kotlin.system.measureTimeMillis

object MeasureTimeUtil {
    fun measureExecuteTime(fn: () -> Unit) {
        val result = measureTimeMillis {
            fn.invoke()
        }
        println("result: $result ms")
    }
}