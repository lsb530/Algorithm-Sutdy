package 연습.기본수학;

import java.util.Arrays;
import java.util.Scanner;

public class 소수찾기 {

    static boolean[] arr;

    public static void main(String[] args) {
        // 소수: 자신보다 작은 두개의 자연수를 곱하여 만들 수 없는 1보다 큰 자연수이다.
        //ex) 5는 5*1 또는 1*5로 수를 곱합 결과를 적는 유일한 방법이 그 수 자신을 포함하기 때문에 5는 소수이다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 디폴트 100
        arr = new boolean[n + 1];    //true 이면 해당 인덱스 소수.
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        Eratosthenes(n);
        StringBuilder prime = new StringBuilder();
        StringBuilder nonPrime = new StringBuilder();
        for (int i = 0; i <= n; i++) {
//            if (isPrime1(i)) {
//            if (isPrime2(i)) {
            if (isPrime3(i) || arr[i]) {
                prime.append(i + " ");
            } else {
                nonPrime.append(i + " ");
            }
        }
        prime.append("는 소수입니다");
        nonPrime.append("는 소수가 아닙니다");
        System.out.println(prime);
        System.out.println(nonPrime);
        System.out.println("Prime number list from 2 to " + n + " : ");
        for (int i = 0; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // 가장 원초적인 알고리즘: O(N)
    public static boolean isPrime1(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 개선했지만 상수는 취급 안하므로(N/2)까지만 검색하지만.. O(N)
    public static boolean isPrime2(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 해당 숫자의 √N 까지 확인하는 방법이다. 이 원리는 약수의 중심을 구하는 방법이다. 예를들어 80의 약수는 아래와 같다.
    //  1, 2, 4, 5, 8, 10, 16, 20, 40, 80
    // 1:80, 2:40, 4:20, 5:16, 8:10. √80의 값은 대략 8.xxx의 값이 나온다.
    // 즉 약수들의 곱으로 봤을때 루트를 씌운 값이 중간값이 된다.
    // 이 원리는 이용하여 2에서부터 √N의 값까지 검색을한다며 이후의 값은 확인할 필요가 없게 된고 시간복잡도는 O(√N)이 된다.
    public static boolean isPrime3(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 에라토스테네스의 체(시간복잡도: O(N*loglogN)
    // 2 부터 숫자를 키워가며 배수들을 제외(false 할당)
    public static void Eratosthenes(int n) {
        for (int i = 2; i * i <= n; i++) {
            // i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
            for (int j = i * i; j <= n; j += i) {
                arr[j] = false; //n를 제외한 n의 배수 false
            }
        }
    }
}