package programmers.level1.비밀지도1차;

import java.util.Arrays;

public class Sol {

    public static String getBinary(int num, int n) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        for (int i = sb.length(); i < n; i++) {
            sb.append(0);
        }
        return sb.reverse().toString();
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = "";
            String binary1 = getBinary(arr1[i], n);
            String binary2 = getBinary(arr2[i], n);
            for (int j = 0; j < n; j++) {
                str += binary1.charAt(j) == '1' || binary2.charAt(j) == '1' ? '#' : ' ';
            }
            answer[i] = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(
            Arrays.toString(
                s.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})
            )
        );
        System.out.println(
            Arrays.toString(
                s.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})
            )
        );
    }
}
