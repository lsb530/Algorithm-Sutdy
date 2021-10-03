package boj.steps.a9기본수학2.베르트랑공준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                int j;
                for (j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                }
                if ((j * j > i) && (i != 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}