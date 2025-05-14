package programmers.level1.비밀지도1차;

import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] s1 = toBinary(n, arr1);
        String[] s2 = toBinary(n, arr2);
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                String x = String.valueOf(s1[i].charAt(j) - '0' | s2[i].charAt(j) - '0');
                temp += (x.equals("1")) ? "#" : " ";
            }
            answer[i] = temp;
        }
        return answer;
    }

    public String[] toBinary(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            StringBuilder sub = new StringBuilder();
            while (x > 0) {
                sub.append(x % 2);
                x /= 2;
            }
            int len = sub.length();
            int i = 0;
            while(i < n-len) {
                sub.append(0);
                i++;
            }
            sub.reverse();
            sb.append(sub).append(" ");
        }
        return sb.toString().split(" ");
    }
}