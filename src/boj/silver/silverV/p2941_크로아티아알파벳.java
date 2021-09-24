package boj.silver.silverV;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class p2941_크로아티아알파벳 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        String[] croAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < croAlpha.length; j++) {
                if (i + croAlpha[j].length() > s.length()) continue;
                String diffStr = s.substring(i, i+croAlpha[j].length());
                if (diffStr.equals(croAlpha[j])) {
                    answer++;
                    i += diffStr.length() - 1;
                    flag = true;
                }
            }
            if (!flag) answer++;
        }
        System.out.println(answer);
    }

}