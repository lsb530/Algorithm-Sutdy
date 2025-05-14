package skills.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class n개괄호로만들수있는조합 {
        /*
        TASK
        N개 괄호로 만들 수 있는 모든 조합 출력하기.
     */

    @Test
    public void test() {
        assertNull(괄호경우의수구하기(0));
//        assertThat(null, is(괄호경우의수구하기(0)));
        List<String> actual = new ArrayList<>();
        actual.add("(())");
        actual.add("()()");
        assertEquals(괄호경우의수구하기(2), actual);
        actual = new ArrayList<>();
        actual.add("((()))");
        actual.add("(()())");
        actual.add("(())()");
        actual.add("()(())");
        actual.add("()()()");
        assertEquals(괄호경우의수구하기(3), actual);
    }

    public List<String> 괄호경우의수구하기(int n) {
        if (n == 0) {
            return null;
        }
        List<String> combination = combination(n, n, "", new ArrayList<>());
        System.out.println(combination);
        return combination;
    }

    private List<String> combination(int start, int end, String pairs, List<String> result) {
        if (start > end || start < 0) return result;
        if (start == 0 && end == 0) {
            result.add(pairs);
            return result;
        }
        combination(start - 1, end, pairs + "(", result);
        combination(start, end - 1, pairs + ")", result);
        return result;
    }
}