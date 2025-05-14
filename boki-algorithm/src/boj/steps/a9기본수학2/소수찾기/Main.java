package boj.steps.a9기본수학2.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num == 1 || num % 2 == 0) return false;
        double sqrt = Math.sqrt(num);
        for(int i = 3; i <= sqrt; i+=2) { // O(root(N))
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(isPrime(x)) result++;
        }
        System.out.println(result);
    }

}