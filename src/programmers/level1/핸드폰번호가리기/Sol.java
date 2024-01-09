package programmers.level1.핸드폰번호가리기;

public class Sol {
    public String solution(String phone_number) {
        if (phone_number.length() > 13) {
            return phone_number.replaceAll("(?<=.{8})." , "*");
        }
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution("01033334444"));
        System.out.println(s.solution("027778888"));
        System.out.println(s.solution("920530-1067023"));
    }
}
