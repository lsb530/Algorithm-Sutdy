using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int a, int b, int c)
    {
        var set = new HashSet<int>{ a, b, c };
        int sum = a + b + c;
        int squareSum = Convert.ToInt32(Math.Pow(a, 2) + Math.Pow(b, 2) + Math.Pow(c, 2));
        int cubeSum = Convert.ToInt32(Math.Pow(a, 3) + Math.Pow(b, 3) + Math.Pow(c, 3));
        switch (set.Count)
        {
            case 1:
                return sum * squareSum * cubeSum;
            case 2:
                return sum * squareSum;
            case 3:
                return sum;
            default:
                return 0;
        }
    }
}