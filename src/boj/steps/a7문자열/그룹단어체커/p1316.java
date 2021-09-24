package boj.steps.a7문자열.그룹단어체커;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int end = Integer.parseInt(br.readLine());
        char before = '0';
        int cnt = 0;
        boolean group = false;
        for (int j = 0; j < end; j++) {
            int[] diff = new int[26];
            Arrays.fill(diff, -1);
            String[] str = br.readLine().trim().split("");
            for (int i = 0; i < str.length; i++) {
                char c = str[i].charAt(0);
                if (i >= 1 && before == c) { // 1부터 이전 값과 같으면 continue
                    continue;
                } else { // 1부터 이전 값과 다르면
                    if (diff[c - 'a'] != -1) { // 초기값이 아니라면
                        group = false;
                        break;
                    }
                }
                diff[c - 'a'] = 0;
                before = c;
                group = true;
            }
            cnt += (group) ? 1 : 0;
        }
        System.out.println(cnt);
    }

}