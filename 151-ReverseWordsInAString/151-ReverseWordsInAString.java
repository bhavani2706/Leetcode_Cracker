// Last updated: 09/07/2026, 10:03:50
class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] str=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            //StringBuilder sb=new StringBuilder(str[i]);
           // res+=sb.toString()+" ";
           res+=str[i]+" ";
        }
        return res.trim().replaceAll("\\s+"," ");
    }
}