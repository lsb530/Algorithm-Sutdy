package 연습.기본수학;

public class 소수점올림내림반올림 {

    public static void main(String[] args) {
        float data = 12.345f;
        // 올림
        double ceil = Math.ceil(data * 100) / 100; // 소수점 2째자리까지 나오게 하기 위함
        System.out.println(ceil);
        // 내림
        double floor = Math.floor(data * 100) / 100;
        System.out.println(floor);
        // 반올림
        double round = Math.round(data * 100) / 100.0;
        System.out.println(round);

        double test = 12.3456789;
//        double test = 12.34;
        // 반올림을 무조건 해주지만, 자리값을 채워서 나타낸다
        System.out.printf("%.2f%n", test); //결과 : 12.35
        System.out.printf("%.3f%n", test); //결과 : 12.346
    }
}