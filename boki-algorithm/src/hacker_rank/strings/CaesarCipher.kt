package hacker_rank.strings

class CaesarCipher {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            caesarCipher("middle-Outz", 2)
            caesarCipher("abcdefghijklmnopqrstuvwxyz", 2)
        }


        private fun caesarCipher(s: String, k: Int): String {
            val originalAlphabet = "abcdefghijklmnopqrstuvwxyz"
            val rotatedAlphabetArr = CharArray(originalAlphabet.length)
            for (i in originalAlphabet.indices) {
                rotatedAlphabetArr[i] = originalAlphabet[(i + k) % originalAlphabet.length]
            }
            val rotateMap = mutableMapOf<Char, Char>()
            for (i in originalAlphabet.indices) {
                rotateMap[originalAlphabet[i]] = rotatedAlphabetArr[i]
            }
            // println(rotateMap)
            var decodedStr = ""
            for (c in s) {
                if (c.isLetter()) {
                    if (c.isUpperCase()) {
                        decodedStr += (rotateMap[c.lowercaseChar()])?.uppercase()
                    } else {
                        decodedStr += rotateMap[c]
                    }
                }
                else {
                    decodedStr += c
                }
            }
            // println(decodedStr)
            return decodedStr
        }
    }
}