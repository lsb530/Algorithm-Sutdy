package programmers.level1.삼진법뒤집기;

public class Solution {

    public static void main(String[] args) {
        solution(45);
        solution(125);
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n%3);
            n /= 3;
        }
        int answer = 0;
        int initial = sb.length() - 1;
        int multiply = 1;
        for (int i = 0; i < sb.length(); i++, initial--) {
            for (int j = 0; j < initial; j++) {
                multiply *= 3;
            }
            answer += (multiply * (sb.charAt(i) - '0'));
            multiply = 1;
        }
        return answer;
    }
}