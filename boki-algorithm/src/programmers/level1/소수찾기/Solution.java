package programmers.level1.소수찾기;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        solution2(10);
        solution2(5);
//        Assertions.assertEquals(solution(10), 4);
//        Assertions.assertEquals(solution(5), 3);
    }

    boolean[] prime;

    public int solution(int n) {
        int cnt = 0;
        for (int i = 2; i * i <= n; i++) {
            if(isPrime(i)) cnt++;
        }
        return cnt;
    }

    public int solution2(int n) {
        prime = new boolean[n + 1];
        Eratostenes(n);
        int cnt = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                cnt++;
//                System.out.print(i + " ");
            }
        }
        return cnt;
    }

    public boolean isPrime(int n) {
        int cnt = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) cnt++;
            if (cnt >= 3)
                return false;
        }
        return true;
    }

    public void Eratostenes(int num) {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= num; i++) {
            for (int j = i * i; j <= num; j += i) {
                prime[j] = false; //2를 제외한 2의 배수 false
            }
        }
    }
}