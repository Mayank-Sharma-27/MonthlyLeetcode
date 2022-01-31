package day29;

import java.util.Stack;

public class Day29 {
    public int largestRectangleArea(int[] heights) {

        int[] left = new int[heights.length];
        left = getNextSmallestElementsToLeft(heights);


        int[] right = new int[heights.length];
        right = getNextSmallestElementsToRight(heights);

        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (right[i] - left[i] - 1);

            max = Math.max(area, max);
        }
        return max;
    }

    int[] getNextSmallestElementsToRight(int[] heights) {
        Stack<Integer> stack = new Stack();

        int[] ans = new int[heights.length];
        ans[heights.length - 1] = heights.length;
        stack.push(heights.length - 1);
        for (int i = heights.length - 2; i >= 0; i--) {

            if (heights[stack.peek()] >= heights[i]) {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                ans[i] = heights.length;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(i);

        }
        return ans;
    }

    int[] getNextSmallestElementsToLeft(int[] heights) {
        Stack<Integer> stack = new Stack();

        int[] ans = new int[heights.length];
        ans[0] = -1;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {

            if (heights[stack.peek()] >= heights[i]) {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(i);

        }
        return ans;
    }
}
