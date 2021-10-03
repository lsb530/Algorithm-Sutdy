package skills;

public class precise {

    public static void main(String[] args) {
//        float a = 0.1f;
//        float b = 0.2f;
//        float c = 0.3f;
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        // 부동소수점 차이는 정확한 값이 아니라 근사치로 처리한다(조금의 오차가 생김)
        // 그래서 Math.sqrt 가 정확하지 않을 수 있음
        if (a + b == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}