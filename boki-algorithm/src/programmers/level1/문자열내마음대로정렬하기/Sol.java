package programmers.level1.문자열내마음대로정렬하기;

import java.util.Arrays;

public class Sol {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            else {
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(s.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}
