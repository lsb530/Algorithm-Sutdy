package skills.str;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class 애너그램판별 {
    @Test
    public void test() {
        assertTrue(애너그램판별_USE_MAP("arc", "car"));
        assertTrue(애너그램판별_USE_MAP("caaabbb", "abababc"));
        assertFalse(애너그램판별_USE_MAP("caabbbb", "abababc"));
        assertFalse(애너그램판별_USE_MAP("arc", "carr"));
        assertFalse(애너그램판별_USE_MAP("arc", "caz"));
    }

    private boolean 애너그램판별_USE_MAP(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> strMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (strMap.containsKey(c)) {
                strMap.put(c, strMap.get(c) + 1);
            } else {
                strMap.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!strMap.containsKey(c)) {
                return false;
            }
            if (strMap.get(c) == 0) {
                return false;
            }
            strMap.put(c, strMap.get(c) - 1);
        }

        return true;
    }
}