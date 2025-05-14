package programmers.코딩기초트레이닝.조건문.원소들의곱과합;

import java.util.stream.IntStream;

class Solution {
    public static int solution(int[] num_list) {
        int mul = IntStream.of(num_list).reduce(1, (l, r) -> l * r);
        int sum = IntStream.of(num_list).reduce(0, Integer::sum);
        return mul < sum * sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }
}