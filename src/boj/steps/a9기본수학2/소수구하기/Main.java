package boj.steps.a9기본수학2.소수구하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        double sqrt = Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // M 이상 N 이하의 소수 모두 출력 3 16
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for (int i = M; i <= N; i++) {
            if(isPrime(i)) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

}