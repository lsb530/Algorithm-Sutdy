package boj.bronze.bronzeI;

import java.util.Scanner;

public class p1924 {

    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int mon = Integer.parseInt(x[0]);
        int day = Integer.parseInt(x[1]);
        int totalDays = 0;
        for (int i = 1; i < mon; i++) {
            totalDays += days[i - 1];
        }
        totalDays += day;
        System.out.println(answer[totalDays % 7]);
    }
}