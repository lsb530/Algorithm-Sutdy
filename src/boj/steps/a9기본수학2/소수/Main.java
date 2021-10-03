package boj.steps.a9기본수학2.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num == 1 || num % 2 == 0) return false;
        double sqrt = Math.sqrt(num);
        for(int i = 3; i <= sqrt; i+=2) { // O(root(N))
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;
        boolean flag = false;
        for (int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
                flag = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (flag) {
            sb.append(sum).append("\n").append(min);
        } else {
            sb.append(-1);
        }
        System.out.println(sb);
    }

}