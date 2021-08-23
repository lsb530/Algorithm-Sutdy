package boj.steps.a11브루트포스.영화감독숌;

import static java.lang.System.in;
import java.io.*;

public class p1436 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int number = 666;
        int count = 1;
        while (N != count) {
            number++;
            if (Integer.toString(number).contains("666")) {
//                System.out.println(number);
                count++;
            }
        }
        System.out.println(number);
    }
}