package leetcode.reversestring.java;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] charArr1 = "hello".toCharArray();
        System.out.println(charArr1);
        sol.reverseString(charArr1);
        System.out.println(charArr1);

        char[] charArr2 = "Hannah".toCharArray();
        System.out.println(charArr2);
        sol.reverseString(charArr2);
        System.out.println(charArr2);
    }

}

class Solution {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

}
