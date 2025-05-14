package skills.str;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 문자열압축 {
    @Test
    public void test() {
        assertNull(runLengthCompress_USE_HASHMAP(null));
        assertEquals(runLengthCompress_USE_HASHMAP("aaabbbccc"), "a3b3c3");
        assertEquals(runLengthCompress_USE_HASHMAP("aabbacbccc"), "a3b3c4");
        assertEquals(runLengthCompress_USE_HASHMAP("aaabbbccc"), "a3b3c3");
    }

    private String runLengthCompress_USE_HASHMAP(String str) {
        if (str == null) return null;

        Map<Character, Integer> charCounter = new HashMap<>(str.length());

        for (char c : str.toCharArray()) {
//            if (!charCounter.containsKey(c)) {
//                charCounter.put(c, 0);
//            }
//            charCounter.put(c, charCounter.get(c) + 1);
            charCounter.put(c, charCounter.getOrDefault(c,0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        charCounter.forEach((chr, count) -> sb.append(chr + count.toString()));
        return sb.toString();
    }

    private String runLengthCompress(String str) {
        if (str == null) return null;

        char[] ca = str.toCharArray();
        String result = "";
        int count = 1;
        char prev = ca[0];

        for (int i = 1; i < ca.length; i++) {
            if (prev == ca[i]) {
                count++;
            } else {
                result = result + prev + count;
                count = 1;
                prev = ca[i];
            }
        }
        result = result + prev + count;
        return result;
    }
}