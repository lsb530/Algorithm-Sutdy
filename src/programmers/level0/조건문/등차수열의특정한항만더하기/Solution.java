package programmers.코딩기초트레이닝.조건문.등차수열의특정한항만더하기;

import java.util.stream.IntStream;

class Solution {
    public static int solutiong(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
                .filter(idx -> included[idx])
                .map(idx -> a + (idx * d))
                .reduce(0, Integer::sum);
    }
}