// Last updated: 09/07/2026, 09:45:48
class Solution {
    public long sumAndMultiply(int n) {
      long sum=0; 
      long x=0;
       while(n>0){
        int digits=n%10;
        if(digits!=0){
           sum+=digits;
            x=x*10+digits;
       }
        n/=10;
       }
       long res=0;
       while(x>0){
        long digit=x%10;
        res=res*10+digit;
        x/=10;
       }
      
       return res*sum;
    }
}