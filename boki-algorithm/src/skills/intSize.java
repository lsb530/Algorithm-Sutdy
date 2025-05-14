package skills;

public class intSize {

    public static void main(String[] args) {
        int x = 123;
        int length = (int) Math.log10(x) + 1;
        System.out.println("length = " + length);
    }
}