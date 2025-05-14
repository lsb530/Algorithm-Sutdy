package codility.lessons.iterations;

public class BinaryGap {

    public static void main(String[] args) {
//        solution(1041);
//        solution(32);
    }

    public static int solution(int N){
        StringBuilder sb = new StringBuilder();
        // 2진갭은 1부터 1까지 둘러쌓여있는 연속된 0의 최대길이
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        sb.reverse();
        int max = 0;
        int n = 0;
        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i) == '0') n++;
            else {
                max = Math.max(max, n);
                n = 0;
            }
        }
        System.out.println(sb);
        System.out.println(max);
        // System.out.println(N);
        return 1;
    }

}