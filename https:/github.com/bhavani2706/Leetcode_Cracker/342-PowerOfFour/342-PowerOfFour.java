// Last updated: 09/07/2026, 09:49:09
class Solution {
    public boolean isPowerOfFour(int n) {
      
         if(n==1)
                return true;
                 if(n%4!=0 || n<=0)
             return false;
        return isPowerOfFour(n/4);  

        
    }
}