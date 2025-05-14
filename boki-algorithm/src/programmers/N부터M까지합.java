package programmers;

public class N부터M까지합 {

    public static int getSum(int start, int fin) {
        return fin / start * (start + fin) / 2;
    }

    public static void main(String[] args) {
        int i = 10 * (1 + 10) / 2;
        System.out.println(getSum(1, 10));
    }
}
