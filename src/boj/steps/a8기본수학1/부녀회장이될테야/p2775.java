package boj.steps.a8기본수학1.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2775 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] apartment;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int A = Integer.parseInt(br.readLine()); // A층
            int B = Integer.parseInt(br.readLine()); // B호
            apartment = new int[A + 1][B + 1];
            for (int i = 0; i <= B; i++) {
                apartment[0][i] = i;
            }
            for (int i = 1; i <= A; i++) {
                for (int j = 1; j <= B; j++) {
                    apartment[i][1] = 1;
                    apartment[i][j] = apartment[i][j-1] + apartment[i-1][j];
                }
            }
            System.out.println(apartment[A][B]);
        }
    }

}