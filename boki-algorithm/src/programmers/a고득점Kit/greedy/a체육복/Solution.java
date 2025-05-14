package programmers.a고득점Kit.greedy.a체육복;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 최대한 많은 학생이 체육 수업을 들어야 함
        ArrayList<Integer> able = new ArrayList<>();
        for (Integer x : reserve) {
            able.add(x);
        }
        int losts = lost.length;
        // lost, reserve 둘다에 같은 수가 있는 경우
        Iterator<Integer> iterator = able.iterator();
        while(iterator.hasNext()) {
            Integer val = iterator.next();
            for (int l : lost) {
                if(l == val) iterator.remove();
            }
        }
        for (int l : lost) {
            if (able.contains(l - 1)) {
                able.remove(Integer.valueOf(l - 1));
                answer++;
            } else if (able.contains(l + 1)) {
                able.remove(Integer.valueOf(l + 1));
                answer++;
            }
        }
        return n - losts + answer;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reverse1 = {1, 3, 5};
        int sol1 = solution(n1, lost1, reverse1);
        System.out.println("sol1 = " + sol1);

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reverse2 = {3};
        int sol2 = solution(n2, lost2, reverse2);
        System.out.println("sol2 = " + sol2);

        int n3 = 3;
        int[] lost3 = {3};
        int[] reverse3 = {1};
        int sol3 = solution(n3, lost3, reverse3);
        System.out.println("sol3 = " + sol3);
    }
}