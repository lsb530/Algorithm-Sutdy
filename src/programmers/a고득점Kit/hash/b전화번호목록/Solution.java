package programmers.a고득점Kit.hash.b전화번호목록;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        boolean ans1 = solution(phone_book1);
        System.out.println(ans1);
        String[] phone_book2 = {"123", "456", "789"};
        boolean ans2 = solution(phone_book2);
        System.out.println(ans2);
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};
        boolean ans3 = solution(phone_book3);
        System.out.println(ans3);
    }

    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String number : phone_book) {
            map.put(number, number.length());
        }
        for (String number : phone_book) {
            for (int i = 0; i < number.length(); i++) {
                if(map.containsKey(number.substring(0, i))) return false;
            }
        }
        return true;
    }
}