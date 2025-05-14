using System;
using System.Linq;

public class Solution {
    public int solution(int[] num_list) =>
    num_list.Aggregate(1, (acc, x) => acc * x) < Math.Pow(num_list.Sum(), 2) ? 1 : 0;
}