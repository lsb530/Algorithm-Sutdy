package boj.steps.a9기본수학2.골드바흐의추측;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            int x = 0;
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i) && isPrime(n - i)) {
                    x = i;
                    min = Math.min(min, Math.abs(i - (n - i)));
                    arr[idx][0] = x;
                    arr[idx][1] = min;
                    idx++;
                }
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[1] == o2[1]) {
                        return o1[0] - o2[0]; // 오름차순
                    } else {
                        return o1[1] - o2[1];
                    }
                }
            });
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0] == 0)
                    continue;
                bw.write(arr[i][0] + " " + (n - arr[i][0]) + "\n");
//                System.out.println(arr[i][0] + " " + (n - arr[i][0]));
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}