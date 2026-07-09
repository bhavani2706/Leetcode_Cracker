// Last updated: 09/07/2026, 10:01:14
class Solution {
    public boolean squareIsWhite(String c) {
       if((c.charAt(0)+c.charAt(1))%2!=0)
        return true;
       else 
        return false;
}
}