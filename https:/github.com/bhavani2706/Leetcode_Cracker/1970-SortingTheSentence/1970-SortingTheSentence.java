// Last updated: 09/07/2026, 09:47:06
class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
         String[] res=new String[str.length];
         for(String j:str){
            int i=j.charAt(j.length()-1)-'0';
            res[i-1]=j.substring(0,j.length()-1);
         }
         return String.join(" ",res);
    }
}