package skills.str;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 문자열배열에서문자열의빈도수 {
    @Test
    public void test() {
        String[] strArr = new String[100];
        assertEquals(countStringInDocs(strArr, null),0);
        strArr[0] = "jbee";
        assertEquals(countStringInDocs(strArr, "jbee"),1);
        strArr[1] = "jbee";
        assertEquals(countStringInDocs(strArr, "jbee"),2);
        strArr[2] = "jbee";
        assertEquals(countStringInDocs(strArr, "jbee"),3);
    }

    private int countStringInDocs(String[] strArr, String target) {
        if (strArr == null || target == null) return 0;

        Map<String, Integer> countString = new HashMap<>();
        Arrays.stream(strArr).forEach(str -> {
//            if (!countString.containsKey(str)) {
//                countString.put(str, 0);
//            }
//            countString.put(str, countString.get(str) + 1);
            countString.put(str, countString.getOrDefault(str,0) + 1);
        });

        if (countString.get(target) == null) {
            return 0;
        }

        return countString.get(target);
    }
}