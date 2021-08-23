package skills;

import java.util.Scanner;

public class sumToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) { // O(N)
            sum += i;
        }
        System.out.println(sum);
        sum = n*(n+1)/2; // O(1)
        System.out.println(sum);
    }
}