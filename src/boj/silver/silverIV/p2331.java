package boj.silver.silverIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.function.Predicate;

public class p2331 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        ArrayList<Integer> check = new ArrayList<>();
        check.add(x);
        while (true) {
            int next = 0;
            while (x > 0) {
                int a = x % 10;
                next += Math.pow(a, p);
                x /= 10;
            }
            boolean isContain = check.contains(next);
            if (isContain) {
                int duplicatedIndex = check.indexOf(next);
                for (int i = duplicatedIndex; i < check.size(); i++) {
                    // 57 74 65 61 [37 58 89 145 42 20 4 16]
                    check.remove(i--); // remove 를 하면 인덱스가 바뀜
                }
                break;
            }
            check.add(next);
//            System.out.println(check.indexOf(next));
            x = next;
        }
        System.out.println(check.size());
//        for (Integer integer : check) {
//            System.out.print(integer + " ");
//        }
    }

}