package leetcode.groupanagrams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        var answer1 = sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(answer1); // [["bat"],["nat","tan"],["ate","eat","tea"]]

        var answer2 = sol.groupAnagrams(new String[]{});
        System.out.println(answer2);

        var answer3 = sol.groupAnagrams(new String[]{"a"});
        System.out.println(answer3);
    }

}

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!results.containsKey(key)) {
                results.put(key, new ArrayList<>());
            }
            results.get(key).add(str);
        }

        return new ArrayList<>(results.values());
    }

}