package programmers.level2.괄호변환;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("(()())()"),"(()())()");
        Assertions.assertEquals(solution(")("),"()");
        Assertions.assertEquals(solution("()))((()"),"()(())()");
    }

    Character left = '(';
    Character right = ')';

    public String solution(String p) {
        StringBuilder sb = new StringBuilder(p);
        if(check(sb)) return p;
        return split(p);
    }

    public boolean check(StringBuilder str) {
        if(str.charAt(0) == ')') return false;
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == left)
                cnt++;
            else {
                cnt--;
                if(cnt < 0) return false;
            }
        }
        return true;
    }

    public String split(String str) {
        if(str.length() == 0) return "";
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        int open = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == left) open++;
            else open--;
            if(open == 0) {
                u.append(str, 0, i + 1);
                v.append(str, i + 1, str.length());

                if(check(u)) {
                    u.append(split(v.toString()));
                } else {
                    String temp = "";
                    temp += left;
                    temp += split(v.toString());
                    temp += right;
                    temp += reverse(u.toString());
                    return temp;
                }
                break;
            }
        }
        return u.toString();
    }

    public String reverse(String str){
        StringBuilder s = new StringBuilder();
        for(int i = 1; i<str.length()-1;i++){
            if(str.charAt(i) == '(') s.append(")");
            else s.append("(");
        }
        return s.toString();
    }
}