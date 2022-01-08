package codility.lessons.timecomplexity;

import util.ArrayUtil;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 3};
        int solution = solution(arr);
        System.out.println(solution);
    }

    public static int solution(int[] A) {
        int[] sumArr = new int[A.length - 1];
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        int x = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sumArr.length; i++) {
            x += A[i];
            sumArr[i] += Math.abs(x - (sum - x));
            min = Math.min(min, sumArr[i]);
        }
        ArrayUtil.print(sumArr);
        return min;
    }
}