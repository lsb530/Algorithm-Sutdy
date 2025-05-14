package boj.steps.a10재귀.별찍기10;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2447 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
//        threePrint();
        // 숫자 자리에 N/3의 출력함수를 나타내주면 됨
        // 1 2 3
        // 4 X 6
        // 7 8 9
        String v = "***\n"
            + "* *\n"
            + "***";
        String v1 = "   \n" + "   \n" + "   ";
        String str = "";
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                str += v1;
//                System.out.print("  ");
            }
            else {
                str += v;
//                threePrint();
                System.out.print(v);
//                System.out.print(i + " ");
            }
            if (i % 3 == 0) {
                System.out.println(str);
                str = "";
//                System.out.println();
            }
        }
        System.out.println("-----------");
        String s = "*********\n"
            + "* ** ** *\n"
            + "*********\n"
            + "***   ***\n"
            + "* *   * *\n"
            + "***   ***\n"
            + "*********\n"
            + "* ** ** *\n"
            + "*********";
        String s1 = "***\n"
            + "* *\n"
            + "***";
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s.length());
    }

    private static void threePrint() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != 0 && i != 2 && j != 0 && j != 2) { // i!=0 and i != 3
                    System.out.print(" ");
//                    System.out.print(" " + i + "" + j + "*");
                } else {
                    System.out.print("*");
//                    System.out.print(" " + i + "" + j);
                }
            }
            System.out.println();
        }
    }

}