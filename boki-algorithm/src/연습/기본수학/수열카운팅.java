package 연습.기본수학;

public class 수열카운팅 {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        // x + d를 몇번해야지 y를 뛰어넘는 값이 나올까...?
        System.out.println((int) Math.ceil((y - x) / (double) d));
    }
}