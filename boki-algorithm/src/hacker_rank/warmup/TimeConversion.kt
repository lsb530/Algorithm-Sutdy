package hacker_rank.warmup

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.SimpleTimeZone

class TimeConversion {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(timeConversion("07:05:45PM")) // 19:05:45
            println(timeConversion("12:01:00PM")) // 12:01:00
            println(timeConversion("12:01:00AM")) // 00:01:00
        }

        private fun timeConversion(s: String): String {
            val isAM = s.endsWith("AM")

            // "07" → 7
            val hour12 = s.substring(0, 2).toInt()
            val minute = s.substring(3, 5)
            val second = s.substring(6, 8)

            val hour24 = if (isAM) {
                // AM이면서 12시는 0시로(00시)
                if (hour12 == 12) 0 else hour12
            } else {
                // PM이면서 12시는 그대로 12, 아니면 +12
                if (hour12 == 12) 12 else hour12 + 12
            }

            // 포맷팅: 시는 항상 2자리
            return String.format("%02d:%s:%s", hour24, minute, second)
        }
    }
}