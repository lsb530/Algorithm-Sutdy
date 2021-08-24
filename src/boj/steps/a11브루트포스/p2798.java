package boj.steps.a11브루트포스;
import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        /*
        N, M (N=카드개수, M=3장의 합이 M을 넘지 않는 수)
        5 21
        5 6 7 8 9
        M을 넘지 않으면서 M에 최대한 가까드 카드 3장의 합
        21
         */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int sum;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = a[i] + a[j] + a[k];
                    System.out.printf("a[i]=%d, a[j]=%d, a[k]=%d\n",a[i],a[j],a[k]);
                    if (sum <= m) {
                        ans = Math.max(ans, sum);
                    }
                }
            }
        }
        System.out.println(ans);
    }

}