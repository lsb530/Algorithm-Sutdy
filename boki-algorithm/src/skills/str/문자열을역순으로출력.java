package skills.str;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.SwapUtil;

public class 문자열을역순으로출력 {
    @Test
    public void test() {
        Assertions.assertEquals(solution1("abc"), "cba");
        Assertions.assertEquals(solution1("abcd"), "dcba");

        Assertions.assertEquals(solution2("abc"), "cba");
        Assertions.assertEquals(solution2("abcd"), "dcba");
    }

    // 1. 새로운 배열에 담기
    public String solution1(String str) {
        char[] charArr = str.toCharArray();
        char[] resultArr = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            resultArr[charArr.length - i - 1] = charArr[i];
        }
        return new String(resultArr);
    }

    // 2. swap하기
    public String solution2(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length / 2; i++) {
            SwapUtil.swapValue(charArr, i, charArr.length - 1 - i);
        }
        return new String(charArr);
    }
}