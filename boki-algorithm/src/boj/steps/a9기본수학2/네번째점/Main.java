package boj.steps.a9기본수학2.네번째점;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayList<Integer> arrX = new ArrayList<>();
    static ArrayList<Integer> arrY = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int findX = arrX.indexOf(x);
            int findY = arrY.indexOf(y);

            if (findX == -1) arrX.add(x);
            else arrX.remove(findX);

            if(findY == -1) arrY.add(y);
            else arrY.remove(findY);
        }
        bw.write(arrX.get(0) + " " + arrY.get(0));
        bw.flush();
        bw.close();
    }
}