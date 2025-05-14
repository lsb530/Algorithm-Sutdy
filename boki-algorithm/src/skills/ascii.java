package skills;

import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class ascii {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(in));
//        System.out.println((int)br.readLine().charAt(0));
        out.println((char)65); // A
        out.println((char)48); // 0
        int a = -5;
        int b = 11;
        out.printf("a = %d, b = %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        out.printf("a = %d, b = %d\n", a, b);
    }
}