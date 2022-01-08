package skills.math;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class n비트의경우의수 {
    /*
        TASK
        n비트의 모든 경우의 수를 출력한다.
     */

    @Test
    public void test() {
        List<String> actual1 = new ArrayList<>();
        actual1.add("00");
        actual1.add("01");
        actual1.add("10");
        actual1.add("11");
        Assertions.assertEquals(calcBitCombination(2), actual1);

        List<String> actual2 = new ArrayList<>();
        actual2.add("000");
        actual2.add("001");
        actual2.add("010");
        actual2.add("011");
        actual2.add("100");
        actual2.add("101");
        actual2.add("110");
        actual2.add("111");
        Assertions.assertEquals(calcBitCombination(3), actual2);
    }

    public List<String> calcBitCombination(int n) {
        List<String> strings = bitCombination(n, "", new ArrayList<>());
        return strings;
    }

    private List<String> bitCombination(int n, String str, List<String> list) {
        if (n == str.length()) {
            list.add(str);
            return list;
        }
        bitCombination(n, str + "0", list);
        bitCombination(n, str + "1", list);
        return list;
    }
}