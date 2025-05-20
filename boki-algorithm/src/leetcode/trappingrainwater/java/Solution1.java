package leetcode.trappingrainwater.java;

class Solution1 implements Solution {

    public int trap(int[] height) {
        int volume = 0;
        int leftIdx = 0;
        int rightIdx = height.length - 1;
        int leftMax = height[leftIdx];
        int rightMax = height[rightIdx];

        while (leftIdx < rightIdx) {
            leftMax = Math.max(leftMax, height[leftIdx]);
            rightMax = Math.max(rightMax, height[rightIdx]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[leftIdx];
                leftIdx++;
            }
            else {
                volume += rightMax - height[rightIdx];
                rightIdx--;
            }
        }

        return volume;
    }

}

