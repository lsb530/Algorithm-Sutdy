package programmers.devMaching2nd;

import java.util.Arrays;
import java.util.List;

public class p1 {

    static class Solution {
        public String solution(String[] registered_list, String new_id) {
            StringBuilder S = new StringBuilder(), N = new StringBuilder();
            List<String> diffArr = Arrays.asList(registered_list);
            if(!diffArr.contains(new_id)) return new_id;
            else {
                for (int i = 0; i < new_id.length(); i++) {
                    char ch = new_id.charAt(i);
                    if(48 <= ch && ch <= 57) N.append(ch); // 숫자이면
                    else S.append(ch);
                }
                int x = ("".equals(N.toString())) ? 0 : Integer.parseInt(N.toString());
                while(true) {
                    x++;
                    StringBuilder result = new StringBuilder(S + String.valueOf(x));
                    if(!diffArr.contains(result.toString())) return result.toString();
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] registered_list1 = {
            "card", "ace13", "ace16", "banker", "ace17", "ace14"
        };
        String new_id1 = "ace15";
        String[] registered_list2 = {
            "cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"
        };
        String new_id2 = "cow";
        String[] registered_list3 = {
            "bird99", "bird98", "bird101", "gotoxy"
        };
        String new_id3 = "bird98";
        String[] registered_list4 = {
            "apple1", "orange", "banana3"
        };
        String new_id4 = "apple";
        String solution1 = s.solution(registered_list1, new_id1);
        System.out.println("solution1 = " + solution1);
        String solution2 = s.solution(registered_list2, new_id2);
        System.out.println("solution2 = " + solution2);
        String solution3 = s.solution(registered_list3, new_id3);
        System.out.println("solution3 = " + solution3);
        String solution4 = s.solution(registered_list4, new_id4);
        System.out.println("solution4 = " + solution4);
    }
}