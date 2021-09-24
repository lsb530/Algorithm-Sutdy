package boj.steps.a2if문.알람시계;

import java.util.Scanner;

public class p2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int time = hh * 60 + mm;
        int wakeUpTime = time - 45;
        if (wakeUpTime > 0) {
            System.out.println(wakeUpTime / 60 + " " + wakeUpTime % 60);
        } else {
            int hour = 24 * 60 + wakeUpTime;
            if ( hour / 60 == 24) {
                System.out.println(0 + " " + hour % 60);
            } else {
                System.out.println(hour / 60 + " " + hour % 60);
            }
        }
    }
}