using System;

public class Solution {
    public int solution(int a, int b) {
        var x = int.Parse(a.ToString() + b);
        var y = int.Parse(b.ToString() + a);
        if (x == y || x > y) return x;
        return y;
    }
}