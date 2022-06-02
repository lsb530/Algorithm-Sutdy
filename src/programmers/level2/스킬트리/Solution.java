package programmers.level2.스킬트리;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals(solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}),2);
//        assertEquals(solution("CBD",new String[]{"CAD"}),0);
//        assertEquals(solution("CBD",new String[]{"AEF","ZJW"}),2);
//        assertEquals(solution("REA",new String[]{"REA", "POA"}),1);
//        assertEquals(solution("CBDK",new String[]{"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"}), 4);
//        assertEquals(solution("BDC",new String[]{"AAAABACA"}),0);
//        assertEquals(solution("CBD",new String[]{"C", "D", "CB", "BDA"}),2);
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            String tempSkill = skillTree;
            for (int i = 0; i < skillTree.length(); i++) {
                String s = String.valueOf(skillTree.charAt(i));
                if(!skill.contains(s)) {
                    // 필수스킬이 아닌 애들은 다 공백으로 치환
                    tempSkill = tempSkill.replace(s,"");
                }
            }
//            System.out.println("skill = " + skill);
//            System.out.println("tempSkill = " + tempSkill);
            // indexOf는 앞에서부터 찾음
            if(skill.indexOf(tempSkill) == 0) answer++;
        }
        return answer;
    }
}