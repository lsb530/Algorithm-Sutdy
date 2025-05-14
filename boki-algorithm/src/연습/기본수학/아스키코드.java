package 연습.기본수학;

public class 아스키코드 {

    public static void main(String[] args) {
        // 소문자 a = 97, 대문자 A = 65 두 차이는 32
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.printf("%c = %3d, %c = %d\n", i, i, i - 32, i - 32);
        }
        // '0'은 48이다. 48을 빼주면 숫자 값이 나오게 됨
        // ex) '1'은 아스키 코드로 49.... '1' - '0'을 해주면 49 - 48 = 1이 나오게 됨
        String test = "987654321";
        for (int i = 0; i < test.length(); i++) {
            int v = test.charAt(i) - '0';
            System.out.print(v + " ");
        }
        System.out.println();
    }
}