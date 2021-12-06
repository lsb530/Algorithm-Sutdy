package programmers.a고득점Kit.greedy.c큰수만들기;

public class Solution {

    public static String solution(String number, int k) {
        /*
        만약 리턴해야하는 값이 4자리의 수라면, 입력값에서 맨뒤의 3자리를 제외한 문자열 부분에서 가장 큰 수를 찾는다.
        그리고나서 큰 수를 찾은 자리 이후 부터 마지막 2자리를 제외한 곳에서 큰값을 찾는다.
        이 과정을 반복
        ex) 5678543 => 5,6,7,8중 가장 큰 수 8
         */
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        int comp;
        for (int i = 0; i < number.length() - k; i++) {
            comp = 0;
            for (int j = idx; j <= i + k; j++) {
                if (comp < number.charAt(j) - '0') {
                    comp = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            answer.append(comp);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String number1 = "1924";
        int k1 = 2;
        String sol1 = solution(number1, k1);
        System.out.println("sol1 = " + sol1);

        String number2 = "1231234";
        int k2 = 3;
        String sol2 = solution(number2, k2);
        System.out.println("sol2 = " + sol2);

        String number3 = "4177252841";
        int k3 = 4;
        String sol3 = solution(number3, k3);
        System.out.println("sol3 = " + sol3);
    }
}