package 연습.기본수학;

public class 최대공약수와최소공배수 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int a = 24;
        int b = 18;

        System.out.println(divisor(a, b));
        System.out.println(divisor(20, 23));
//        System.out.println(gcd(a, b));
        System.out.println(gcd_(a, b));
        System.out.println(lcm(a, b));
    }

    // 공약수
    public static String divisor(int a, int b) {
        sb = new StringBuilder();
        int temp = Math.max(a, b);
        int cnt = 0;
        for (int i = 1; i <= temp; i++) {
            if (a % i == 0 && b % i == 0) {
                cnt++;
                sb.append(i + " ");
            }
        }
        if(cnt == 1) { // relatively prime
            System.out.printf("(%d, %d)두 수는 서로소입니다\n", a, b);
            return "";
        }
        return sb.toString();
    }

    // 반복문 최대공약수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 재귀 방식 - 유클리드 호제
    public static int gcd_(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(a, a % b);
    }

    // 최소공배수 : Least Common mulitple
    public static int lcm(int a, int b) {
        return a * b / gcd_(a, b);
    }
}