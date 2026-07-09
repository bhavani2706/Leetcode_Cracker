// Last updated: 09/07/2026, 10:03:15
class Solution {
    public boolean isPowerOfFour(int n) {
      
         if(n==1)
                return true;
                 if(n%4!=0 || n<=0)
             return false;
        return isPowerOfFour(n/4);  

        
    }
}