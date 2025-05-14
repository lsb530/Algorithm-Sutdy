package skills.str;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class 문자열에서문자가고유한지 {

    @Test
    public void test() {
        assertTrue(이중포문을_사용한_방법("abcd"));
        assertTrue(이중포문을_사용한_방법("abcdefghij"));
        assertFalse(이중포문을_사용한_방법("abccde"));
        assertFalse(이중포문을_사용한_방법("abca"));

        assertTrue(HashSet을_사용한_방법("abcd"));
        assertTrue(HashSet을_사용한_방법("abcdefghij"));
        assertFalse(HashSet을_사용한_방법("abccde"));
        assertFalse(HashSet을_사용한_방법("abca"));

    }

    private boolean 이중포문을_사용한_방법(String str) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean HashSet을_사용한_방법(String str) {
        Set<Character> strSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (strSet.contains(c)) {
                return false;
            }
            strSet.add(c);
        }
        return true;
    }
}