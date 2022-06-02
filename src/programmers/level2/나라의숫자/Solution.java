package programmers.level2.나라의숫자;

public class Solution {

    // 반복해서 나오는 나머지
    static String[] numbers = {"4", "1", "2"};

    public static String solution(int n) {
        String answer = "";
        int num = n;
        while (num > 0) {
            System.out.println("3으로 나누기 전 = " + num);
            int remainder = num % 3;
            num /= 3;
            System.out.printf("몫 : %d, 나머지: %d\n", num, remainder);
            // 몫을 하나 낮춰주지 않으면 124가 아니라 012의 나라가 되어버림
//            https://programmers.co.kr/questions/19755
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
//        solution(n1);
//        solution(n2);
//        solution(n3);
//        solution(n4);
        solution(47);
    }
}