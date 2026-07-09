// Last updated: 09/07/2026, 10:01:33
class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] height = new int[n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            // Step 1: Build histogram for this row
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    height[j] = 0;
                } else {
                    height[j] += 1;
                }
            }

            // Step 2: Count submatrices using monotonic stack
            count += countSubmatFromHistogram(height);
        }

        return count;
    }

    private int countSubmatFromHistogram(int[] heights) {
        int n = heights.length;
        int count = 0;
        int[] sum = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                int prevIndex = stack.peek();
                sum[i] = sum[prevIndex] + heights[i] * (i - prevIndex);
            } else {
                sum[i] = heights[i] * (i + 1);
            }

            stack.push(i);
            count += sum[i];
        }

        return count;
    }
}
