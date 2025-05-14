package inflearn.kimtaewon1.c_twopointerandslidingwindow.c_maxsales;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int getSeriesDayMaxSales(
        int n, int days,
        int[] sales
    ) {
        int answer = 0;

        for (int i = 0; i < n && i + days <= n; i++) {
            int sum = 0;
            for (int j = i; j < i + days; j++) {
                sum += sales[j];
            }
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    private static int getSeriesDayMaxSalesBySlidingWindow(
        int n, int days,
        int[] sales
    ) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += sales[i];
        }
        int answer = sum;
        for (int i = days; i < n; i++) {
            sum += (sales[i] - sales[i - days]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int days = sc.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        // System.out.println(getSeriesDayMaxSales(n, days, sales));
        System.out.println(getSeriesDayMaxSalesBySlidingWindow(n, days, sales));
    }
}
