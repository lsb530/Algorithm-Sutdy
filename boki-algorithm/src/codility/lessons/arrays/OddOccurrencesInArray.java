package codility.lessons.arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        // 혼자 남는 수를 출력
        int solution = solution(new int[]{9, 3, 9, 3, 9, 7, 9});
        System.out.println(solution);
    }

    public static int solution(int[] A) {
        // xor은 A^A = 0
        // a^a = 0이랑 0^b=b 교환법칙 적용
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.printf("x=%d(%s) / A[i]=%d(%s), ", x, binary(x), A[i], binary(A[i]));
            x ^= A[i];
            System.out.printf("x^A[i] = %d(%s)\n", x, binary(x));
        }
        return x;
    }

    public static String binary(int N) {
        if(N==0) return "0";
        StringBuilder sb = new StringBuilder();
        // 2진갭은 1부터 1까지 둘러쌓여있는 연속된 0의 최대길이
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        return sb.reverse().toString();
    }
}