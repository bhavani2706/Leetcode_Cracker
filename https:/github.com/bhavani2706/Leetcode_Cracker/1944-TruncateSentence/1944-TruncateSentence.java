// Last updated: 09/07/2026, 09:47:11
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String str="";
        for(int i=0;i<k;i++){
            str=str+arr[i];
            if(i<k-1){
            str+=" ";
         }
        }
        return str;
    }
}