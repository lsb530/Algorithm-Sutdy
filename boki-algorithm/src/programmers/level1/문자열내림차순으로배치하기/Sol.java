package programmers.level1.문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sol {

    public String solution(String s) {
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        characters.sort(Comparator.reverseOrder());
        StringBuilder answer = new StringBuilder();
        for (Character c : characters) {
            answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution("Zbcdefg"));
    }
}
