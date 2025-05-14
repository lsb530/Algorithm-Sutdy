package boj.steps.a6함수.정수N개의합;

public class p15596 {

    public long sum(int[] a) {
        long result = 0L;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}