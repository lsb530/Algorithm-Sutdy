package boj.steps.a3for문.X보다작은수;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class p10871 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] result = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt)
            .filter(integer -> integer < X).toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}