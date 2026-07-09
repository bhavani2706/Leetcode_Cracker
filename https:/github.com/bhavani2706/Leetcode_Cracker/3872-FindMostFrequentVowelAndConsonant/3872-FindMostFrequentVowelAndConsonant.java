// Last updated: 09/07/2026, 09:45:46
class Solution {
    public int maxFreqSum(String s) {
       int fre[]=new int[26];
       int mc=0,mv=0;
       int n=s.length();
       for(int i=0;i<n;i++){
        char c=s.charAt(i);
        fre[c-'a']++;
        if(c=='a' || c=='e'|| c=='o' || c=='i' || c=='u'){
         mv=Math.max(mv,fre[c-'a']);
        }
        else{
     mc=Math.max(mc,fre[c-'a']);
        }
       } 
       return mc+mv;
    }
}