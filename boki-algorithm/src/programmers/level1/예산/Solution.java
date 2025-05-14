package programmers.level1.예산;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;
        int sol1 = solution(d1, budget1);
        System.out.println("sol1 = " + sol1);

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        int sol2 = solution(d2, budget2);
        System.out.println("sol2 = " + sol2);
    }

    public static int solution(int[] d, int budget) {
        int money = 0;
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            money += d[i];
//            System.out.println("money = " + money);
            if(money > budget) {
                answer = i;
                break;
            }
        }
        if(money <= budget) answer = d.length;
//        System.out.println("money = " + money);
        return answer;
    }
}