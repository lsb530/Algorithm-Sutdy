package programmers.level1.부족한금액계산하기;

public class Sol {

    public long solution(int price, int money, int count) {
        long totalPayAmt = count * (price + ((long) price * count)) / 2;
        return money > totalPayAmt ? 0 : totalPayAmt - money;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(3, 20, 4));
    }
}
