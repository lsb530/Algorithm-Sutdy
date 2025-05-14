package boj.bronze.bronzeI;

import java.util.Scanner;

public class p11655 {

    public static void main(String[] args) {
        // 65 ~ 89 or 97 ~ 121이 알파벳
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                sb.append(ch - 13 < 'A' ? (char)(ch+13) : (char)(ch-13));
            }
            else if(ch >= 'a' && ch <= 'z') {
                sb.append(ch - 13 < 'a' ? (char)(ch+13) : (char)(ch-13));
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}