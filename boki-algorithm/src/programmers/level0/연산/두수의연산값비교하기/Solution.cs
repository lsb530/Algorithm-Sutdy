using System;

public class Solution {
    public int solution(int a, int b) {
        int x = int.Parse(a.ToString() + b);
        int y = 2 * a * b;
        if (x == y || x > y) return x;
        return y;

        // Simple
        int x = int.Parse($"{a}{b}");
        int y = 2 * a * b;
        return Math.Max(x, y);
    }
}