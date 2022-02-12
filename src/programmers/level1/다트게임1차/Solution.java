package programmers.level1.다트게임1차;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("1S2D*3T"),37);
        Assertions.assertEquals(solution("1D2S#10S"),9);
        Assertions.assertEquals(solution("1D2S0T"),3);
        Assertions.assertEquals(solution("1S*2T*3S"),23);
        Assertions.assertEquals(solution("1D#2S*3S"),5);
        Assertions.assertEquals(solution("1T2D3D#"),-4);
        Assertions.assertEquals(solution("1D2S3T*"),59);
    }

    public int solution(String dartResult) {
        ArrayList<String> dartScore = new ArrayList<>();
        String regex = "(\\d0?\\w[*#]?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);
        while(matcher.find()) {
            dartScore.add(matcher.group());
        }
        String regex1 = "[^0-9]0?";
        String regex2 = "[^S|D|T]";
        String regex3 = "[^*|#]";
        int[] totalScore = new int[3];
        int idx = 0;
        for (String s : dartScore) {
            int score = Integer.parseInt(s.replaceAll(regex1, ""));
            String bonus = s.replaceAll(regex2, "");
            if(bonus.equals("S")) {
                score *= 1;
            } else if(bonus.equals("D")) {
                score = score * score;
            } else {
                score = score * score * score;
            }
            String option = s.replaceAll(regex3, "");
            if(idx != 0 && option.equals("*")) {
                totalScore[idx-1] *= 2;
                score *= 2;
            } else if(idx == 0 && option.equals("*")) {
                score *= 2;
            } else if(option.equals("#")){
                score *= -1;
            }
            totalScore[idx++] = score;
        }
        int answer = 0;
        for (int i = 0; i < totalScore.length; i++) {
            answer += totalScore[i];
        }
        return answer;
    }
}