package inflearn.kimtaewon1.a_string.f_deldupstr;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://cote.inflearn.com/contest/10/problem/01-06
 */
public class Main {

    private static String deleteDuplicatedCharByIndexOf(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }

    private static String deleteDuplicatedCharBySet(String str) {
        Set<Character> hashSet = new LinkedHashSet<>();
        for (Character c : str.toCharArray()) {
            hashSet.add(c);
        }
        StringBuilder answer = new StringBuilder();
        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            answer.append(iterator.next());
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(deleteDuplicatedCharByIndexOf(input));
    }
}
