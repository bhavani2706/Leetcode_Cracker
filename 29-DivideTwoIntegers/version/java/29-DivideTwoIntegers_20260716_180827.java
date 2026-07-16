// Last updated: 16/07/2026, 18:08:27
1class Solution {
2    public int divide(int dividend, int divisor) {
3        int res=dividend/divisor;
4        if(divisor==-1 && dividend==Integer.MIN_VALUE){
5            return Integer.MAX_VALUE;
6        }
7        return res;
8
9    }
10}