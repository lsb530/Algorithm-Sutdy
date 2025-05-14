package skills.str;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class 문자열을int형으로변환 {

    @Test
    public void toIntFromString() {
        assertEquals(toIntFromString("123"), 123);
    }

    private int toIntFromString(String str) {
//        return Integer.parseInt(str);
        char[] strArr = str.toCharArray();
        int base = 0;
        for (char c : strArr) {
            base *= 10;
            base += c - '0';
        }
        return base;
    }
}