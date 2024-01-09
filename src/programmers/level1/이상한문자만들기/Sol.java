package programmers.level1.이상한문자만들기;

public class Sol {

    public String solution(String s) {
        String answer = "";
        String[] splitStr = s.split("");
        for (int i = 0, idx = 0; i < splitStr.length; i++) {
            String x = splitStr[i];
            if (x.equals(" ")) {
                idx = 0;
                answer += " ";
            }
            else {
                idx++;
                if (idx % 2 == 0) {
                    answer += x.toLowerCase();
                }
                else {
                    answer += x.toUpperCase();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        // "TrY HeLlO WoRlD"
        System.out.println(s.solution("try hello world"));
    }
}
