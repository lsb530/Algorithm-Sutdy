class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
//        return my_string.slice(0 until s) +
//                overwrite_string +
//                my_string.slice(s+overwrite_string.length until my_string.length)
        // simple
        return my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
    }
}