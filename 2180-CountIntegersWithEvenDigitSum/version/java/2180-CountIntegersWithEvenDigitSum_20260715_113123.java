// Last updated: 15/07/2026, 11:31:23
1class Solution {
2    public int countEven(int num) {
3        int count=0;
4        for(int i=1;i<=num;i++){
5            int temp=i;
6            int sum=0;
7         while(temp>0){
8           sum+= temp%10;;
9          temp/=10;
10           }
11            if(sum%2==0){
12                count++;
13        }
14        }
15        return count;
16    }
17}