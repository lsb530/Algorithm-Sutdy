package programmers.a고득점Kit.sort.b가장큰수;

import java.util.Arrays;

public class Solution {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        boolean zero = Arrays.stream(numbers).allMatch(value -> value == 0);
        if(zero) return "0";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.printf("앞에서 더하기 %s, 뒤에서 더하기 %s\n", arr[i] + arr[i+1], arr[i+1]+ arr[i]);
//        }
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        for (String s : arr) {
            answer.append(s);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        String sol1 = solution(numbers1);
        System.out.println("sol1 = " + sol1);
        int[] numbers2 = {3, 30, 34, 5, 9};
        String sol2 = solution(numbers2);
        System.out.println("sol2 = " + sol2);
    }
}