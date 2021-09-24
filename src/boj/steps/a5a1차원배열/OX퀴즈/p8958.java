package boj.steps.a5a1차원배열.OX퀴즈;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int num = Integer.parseInt(br.readLine());
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] splited = st.nextToken().split("");
            int a = 0, b;
            for (int j = 0; j < splited.length; j++) {
                if ("O".equals(splited[j])) {
                    a++;
                    b = a;
                    sum += b;
                } else {
                    a = 0;
                }
            }
            result[i] = sum;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}