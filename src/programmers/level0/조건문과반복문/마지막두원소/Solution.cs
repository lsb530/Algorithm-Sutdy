using System;

public class Solution {
    public int[] solution(int[] num_list) {
        var a = num_list[num_list.Length - 1]; // n
        var b = num_list[num_list.Length - 2]; // n - 1
        Array.Resize(ref num_list, num_list.Length + 1);
        if (a > b) num_list[num_list.Length - 1] = a - b;
        else num_list[num_list.Length - 1] = a * 2;
        return num_list;
    }
}