package 연습.기본수학;

public class 모듈러연산 {

    /*
    암호 알고리즘은 모듈러 연산을 가장 빈번하게 사용하는데, mod m일때, 항상 0 ~ m의 범위를 가지는 값을 결과 값으로 가지게 된다.
    만약 음수의 결과 값을 가진다면 절대 값을 취한 값에서 mod를 한 결과를 m을 더하거나 m을 2배,
    3배한 값을 더해 0 ~ m의 범위의 결과 값을 가지도록 하면 된다.

    모듈러 연산의 예시
    17 mod 5 = 2
    20 mod 3 = 2

    음수일 때
    -3 mod 11 = 8
    -11 mod 11 = 0
    -1 mod 11 =10
     */
    public static void main(String[] args) {
        // 모듈러 연산: a mod n(a % n)을 했을때 이 값은 항상 0~n까지의 값을 가진다
        int[] arr = {49, 1, 37, 5};
        int m = 8;
        int a = arr[0] % m;
        int b = arr[1] % m;
        int g = (a + b) % m;
        int h = (arr[0] + arr[1]) % m;
        System.out.printf("g = %d, h = %d\n", g, h);
        int k = modularCongruent(73, 4, 23);
        System.out.println("k = " + k);
        // 모듈러 연산의 3가지 특징
        // 1. (a % n + b % n) % n = (a + b) % n;
        // 2. (a % n - b % n) % n = (a - b) % n;
        // 3. (a % n * b % n) % n = (a * b) % n;
        System.out.println(properties_of_modular_arithmetic(33, 75, 7, '*'));
        System.out.println(properties_of_modular_arithmetic(33, 75, 7, '^'));
    }

    //모듈러 합동(Modular congruent)
    //두 a, b의 숫자가 n을 modular 한 결과 값이 같다면 모듈러 합동관계(congruent modulo n)이라고 한다.
    //mod n에 대해 a-b = kn 일때 a와 b는 합동(Congruent)관계이다. (k는 상수)
    //예를들어 73과 4가 mod 23에 대해 합동관계이면 73-4 = 69 (23 * 3)으로 표시할 수 있고 k의 값이 3을 뜻한다.
    public static int modularCongruent(int a, int b, int n) {
        if (a % n == b % n) {
            return (a - b) / n;
        }
        return -1;
    }

    public static boolean properties_of_modular_arithmetic(int a, int b, int n, char op) {
        int x, y;
        if (a % n != b % n) {
            return false;
        }
        switch (op) {
            case '+':
                x = (a % n + b % n) % n;
                y = (a + b) % n;
                return (x == y);
            case '-':
                x = (a % n - b % n) % n;
                y = (a - b) % n;
                return (x == y);
            case '*':
                x = (a % n * b % n) % n;
                y = (a * b) % n;
                return (x == y);
            case '^':
                x = (a * a * a) % n;
                y = (b * b * b) % n;
                return x == y;
            default:
                break;
        }
        return false;
    }


}