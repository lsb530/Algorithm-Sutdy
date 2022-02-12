package programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimSim {

    public static void main(String[] args) {
//        String regx = "^[0-9]{1}$|^[1]{1}[0]{1}$";
        String regx = "[0-9]{1}$|^[1]{1}[0]{1}$";
        String test1 = "9ST";
        String test2 = "10ST";
        String test3 = "11ST";
        String test4 = "1";
        System.out.println(test1.matches(regx));
        System.out.println(test2.matches(regx));
        System.out.println(test3.matches(regx));
        System.out.println(test4.matches(regx));
//        int solution = solution("1S2D*3T");
//        System.out.println("solution = " + solution);
    }

    public static int solution(String dartResult) {
        int answer = 0;
        Pattern pattern = Pattern.compile("(\\d\\w[*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("group(): " + matcher.group());
            System.out.println("start(): " + matcher.start());
            System.out.println("end(): " + matcher.end());
        }
        return answer;
    }
}