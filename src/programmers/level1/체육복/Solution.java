package programmers.level1.체육복;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};
        int sol1 = solution(n1, lost1, reserve1);
        System.out.println("sol1 = " + sol1);

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        int sol2 = solution(n2, lost2, reserve2);
        System.out.println("sol2 = " + sol2);
        
        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        int sol3 = solution(n3, lost3, reserve3);
        System.out.println("sol3 = " + sol3);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Set<Integer> reserve_set = new HashSet<>();
        Set<Integer> lost_set = new HashSet<>();
        for (int x : reserve) {
            reserve_set.add(x);
        }
        for (int x : lost) {
            if(reserve_set.contains(x)) {
                reserve_set.remove(x);
            } else {
                lost_set.add(x);
            }
        }
        for (int x : lost) {
            if (reserve_set.contains(x - 1)) {
                reserve_set.remove(x - 1);
                lost_set.remove(x);
            }
            if (reserve_set.contains(x + 1)) {
                reserve_set.remove(x + 1);
                lost_set.remove(x);
            }
        }
        return n - lost_set.size();
    }
}

/*
import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 최대한 많은 학생이 체육 수업을 들어야 함
        ArrayList<Integer> able = new ArrayList<>();
        for (Integer x : reserve) {
            able.add(x);
        }
        int losts = lost.length;
        // Iterator<Integer> iterator = able.iterator();
        // while(iterator.hasNext()) {
        //     Integer val = iterator.next();
        //     for (int l : lost) {
        //         if(l == val) iterator.remove();
        //     }
        // }
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
}
 */