package leetcode.trappingrainwater.java;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution2 implements Solution {

    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;

        for (int i = 0; i < height.length; i++) {
            // System.out.println("i = " + i);
            // System.out.println("height[i] = " + height[i]);
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                // System.out.println("top = " + top);
                // System.out.println("stack.peek() = " + stack.peek());

                if (stack.isEmpty()) {
                    break;
                }

                int distance = i - stack.peek() - 1;
                // System.out.println("distance = " + distance);
                int waters = Math.min(height[i], height[stack.peek()]) - height[top];

                volume += distance * waters;
            }

            stack.push(i);
        }

        return volume;
    }

}

