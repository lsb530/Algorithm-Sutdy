package leetcode.validpalindrome.java;

public class Solution2 implements Solution {

    public boolean isPalindrome(String s) {
        String filteredStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(filteredStr).reverse().toString().equals(filteredStr);
    }

}
