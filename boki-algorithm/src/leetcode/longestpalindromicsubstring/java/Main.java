package leetcode.longestpalindromicsubstring.java;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String answer1 = sol.longestPalindrome("babad");
        System.out.println(answer1);

        String answer2 = sol.longestPalindrome("cbbd");
        System.out.println(answer2);
    }

}

class Solution {

    int left, maxLen;

    public String longestPalindrome(String s) {
        left = 0;
        maxLen = 0;

        int len = s.length();

        if (len < 2)
            return s;

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i + 1); // 짝
            extendPalindrome(s, i, i + 2); // 홀
        }

        return s.substring(left, left + maxLen);
    }

    private void extendPalindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        if (maxLen < end - start - 1) {
            left = start + 1;
            maxLen = end - start - 1;
        }
    }

}