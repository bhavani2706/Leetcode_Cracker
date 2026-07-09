// Last updated: 09/07/2026, 09:46:47
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String str[]=sentences[i].split(" ");
            if(str.length>max){
                max=str.length;
            }
        }
       return max; 
    }
}