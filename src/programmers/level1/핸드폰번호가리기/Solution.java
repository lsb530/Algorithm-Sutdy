package programmers.level1.핸드폰번호가리기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("01033334444"), "*******4444");
        Assertions.assertEquals(solution("027778888"), "*****8888");
    }

    public String solution(String phone_number) {
//        return phone_number.replaceAll(".(?=.{4})", "*");
        StringBuilder answer = new StringBuilder();
        answer.append(phone_number.substring(0, phone_number.length() - 4).replaceAll("\\w", "*"));
        answer.append(phone_number.substring(phone_number.length() - 4));
        return answer.toString();
    }
}