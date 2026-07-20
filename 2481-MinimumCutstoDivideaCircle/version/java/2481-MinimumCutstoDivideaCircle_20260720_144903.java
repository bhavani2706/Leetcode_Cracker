// Last updated: 20/07/2026, 14:49:03
1class Solution {
2    public int numberOfCuts(int n) {
3        int res=0;
4        if(n%2==0){
5          res=n/2;
6        }
7        else if(n==1){
8            res=0;
9        }
10        else{
11          res=n;
12        }
13        return res;
14    }
15}