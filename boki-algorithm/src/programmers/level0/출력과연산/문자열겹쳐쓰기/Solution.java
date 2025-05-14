package programmers.코딩기초트레이닝.출력과연산.문자열겹쳐쓰기;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) +
                overwrite_string +
                my_string.substring(s + overwrite_string.length());
    }
}
