package boj.steps.a16그리디.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] arr = s.split("\\-");
        int min = 0;
        min += Add(arr[0]); // -를 만나기 이전까지의 배열은 모두 더하기 처리해줘야됨
        for (int i = 1; i < arr.length; i++) {
            int plus = Add(arr[i]);
            min -= plus;
        }
        System.out.println(min);
    }

    private static int Add(String str) {
        String[] arr = str.split("\\+");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }
        return result;
    }
}