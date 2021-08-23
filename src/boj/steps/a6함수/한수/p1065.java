package boj.steps.a6함수.한수;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int target = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= target; i++) {
            if (hanSu(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean hanSu(int x) {
        if(x < 100) return true; // 2자리 이하는 모두 한수
        int length = (int) (Math.log10(x) + 1);
        int diff = x%10 - (x/10)%10;
        x /= 10;
        for (int i = 0; i < length-2; i++) {
            int j = x % 10 - (x / 10) % 10;
            if(diff != j) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}