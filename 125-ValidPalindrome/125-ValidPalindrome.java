// Last updated: 09/07/2026, 10:04:03
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
       String str=new StringBuilder(s).reverse().toString();
        //str=s.reverse().toString();
        if(s.equals(str)){
            return true;
        }
        else{
        return false;
        }
    }
}