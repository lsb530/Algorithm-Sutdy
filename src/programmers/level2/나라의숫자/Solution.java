package programmers.level2.나라의숫자;

public class Solution {

    static String[] numbers = {"4", "1", "2"};

    public static String solution(int n) {
        String answer = "";
        int num = n;
        while (num > 0) {
            int remainder = num % 3;
            num /= 3;
            if (remainder == 0) {
                num--;
            }
            answer = numbers[remainder] + answer;
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        solution(n1);
        solution(n2);
        solution(n3);
        solution(n4);
    }
}