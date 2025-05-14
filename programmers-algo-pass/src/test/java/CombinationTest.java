import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CombinationTest {
    private static final ArrayList<String> resultList = new ArrayList<>();

    @Test
    public void combination() {
        String x = "ABC";
        combinations(0, x.toCharArray(), "");
        System.out.println(resultList); // [A, АВ, АВС, АС, B, BC, C]
    }

    public static void combinations(int idx, char[] order, String result) {
        if (!result.isEmpty()) {
            System.out.printf("idx = %d, result = %s\n\n", idx, result);
            resultList.add(result);
        }
        for (int i = idx; i < order.length; i++) {
            System.out.printf("call %d(i), %d(i+1)\n", i, i+1);
            combinations(i + 1, order, result + order[i]);
        }

    }
}
