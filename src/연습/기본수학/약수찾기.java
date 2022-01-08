package 연습.기본수학;

public class 약수찾기 {

    public static void main(String[] args) {
        // 약수: 나누어 떨어지는 수
        int limit = 180;
        for (int i = 1; i * i < limit; i++) {
            if (limit % i == 0) {
                System.out.printf("{%d, %d} ", i, limit / i);
            }
        }
        System.out.println();
        for (int i = 1; i < Math.sqrt(limit); i++) {
            if (limit % i == 0) {
                System.out.printf("{%d, %d} ", i, limit / i);
            }
        }
    }
}