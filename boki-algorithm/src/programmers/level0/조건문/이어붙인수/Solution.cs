using System;

public class Solution {
    public int solution(int[] num_list)
        {
            string even = "";
            string odd = "";
            foreach (var x in num_list)
            {
                if (x % 2 == 0) even += x;
                else odd += x;
            }

            return Convert.ToInt32(even) + Convert.ToInt32(odd);
        }
}