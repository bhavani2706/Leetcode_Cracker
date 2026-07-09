// Last updated: 09/07/2026, 09:45:57
class Solution {
    public int minimumArea(int[][] grid) {
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // If there are no 1’s, it's up to problem spec whether to return 0 or something else
        if (minRow == Integer.MAX_VALUE) {
            return 0;
        }

        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}