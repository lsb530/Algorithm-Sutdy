package programmers.level1.시저암호;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("AB", 1), "BC");
        Assertions.assertEquals(solution("z", 1), "a");
        Assertions.assertEquals(solution("z", 2), "b");
        Assertions.assertEquals(solution("a B z", 4), "e F d");
    }

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(c >= 'a' && c <= 'z') {
                if(charArray[i] + n > 'z') {
                    charArray[i] = (char) ((int) charArray[i] + n - 26);
                } else {
                    charArray[i] += n;
                }
            }
            else if(c >= 'A' && c <= 'Z') {
                if(charArray[i] + n > 'Z') {
                    charArray[i] = (char) ((int) charArray[i] + n - 26);
                } else {
                    charArray[i] += n;
                }
            }
        }
        for (char c : charArray) {
            answer.append(c);
        }
        return answer.toString();
    }
}