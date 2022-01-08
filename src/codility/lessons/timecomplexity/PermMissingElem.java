package codility.lessons.timecomplexity;

public class PermMissingElem {

    public static void main(String[] args) {
        solution(new int[]{2, 1, 3, 5});
    }

    public static int solution(int[] A) {
        long sum = (long) (A.length + 1) * (A.length + 2) / 2;
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return (int) sum;
    }
}