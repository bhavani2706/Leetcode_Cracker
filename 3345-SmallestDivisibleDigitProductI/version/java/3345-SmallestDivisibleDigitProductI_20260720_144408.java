// Last updated: 20/07/2026, 14:44:08
1class Solution {
2    public int smallestNumber(int n, int t) {
3        for(int i=n;;i++){
4        int temp=i;
5        int pro=1;
6        while(temp>0){
7         pro*=temp%10;
8           temp/=10;
9        }
10           if(pro%t==0){
11            return i;
12           }
13        }
14    }
15}