package programmers.level1.서울에서김서방찾기;

public class Sol {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) return String.format("김서방은 %d에 있다", i);
        }
        return "";
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(new String[]{"Jane", "Kim"}));
    }
}
