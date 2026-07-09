// Last updated: 09/07/2026, 10:02:46
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        boolean up = true; // direction flag

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if (up) { // moving upward
                if (col == n - 1) { // hit right boundary
                    row++;
                    up = false;
                } else if (row == 0) { // hit top boundary
                    col++;
                    up = false;
                } else { // move up-right
                    row--;
                    col++;
                }
            } else { // moving downward
                if (row == m - 1) { // hit bottom boundary
                    col++;
                    up = true;
                } else if (col == 0) { // hit left boundary
                    row++;
                    up = true;
                } else { // move down-left
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
