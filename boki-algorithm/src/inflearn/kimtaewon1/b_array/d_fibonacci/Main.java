package inflearn.kimtaewon1.b_array.d_fibonacci;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-04
 */
public class Main {

    private static ArrayList<Integer> getFibonacciSeq(int n) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);
        for (int i = 2; i < n; i++) {
            Integer x = fibonacciList.get(i - 1);
            Integer y = fibonacciList.get(i - 2);
            fibonacciList.add(x + y);
        }
        return fibonacciList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        String result = getFibonacciSeq(n)
            .stream().map(String::valueOf)
            .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
