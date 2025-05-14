package boj.steps.a8기본수학1.달팽이는올라가고싶다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 Am
        final int B = Integer.parseInt(st.nextToken());// 밤에 미끄러지는 Bm
        int V = Integer.parseInt(st.nextToken()); // 올라가야할 Vm
        int day = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) { // 남은 블럭이 있는지 체크
            day++;
        }
        System.out.println(day);
//        while (V > 0) {
//            day++;
//            V -= A;
//            if(V <= 0) break;
//            V += B;
//        }
//        System.out.println(day);
    }

}