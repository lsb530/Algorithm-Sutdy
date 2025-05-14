package 연습.기본수학;

public class 숫자의길이반환 {

    public static void main(String[] args) {
        // log10을 하면 자리수 - 1만큼 나오니깐 +1을 해준다
        int x = 38652123;
        int len = (int) Math.log10(x) + 1;
        System.out.println("len = " + len);
        x = 100;
        int v = (int) Math.log10(x);
        System.out.println("v = " + v);
    }
}