// Last updated: 11/07/2026, 18:21:47
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5        int res[][]=new int[m][n];
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                res[j][i]=matrix[i][j];
9            }
10        }
11        return res;
12    }
13}