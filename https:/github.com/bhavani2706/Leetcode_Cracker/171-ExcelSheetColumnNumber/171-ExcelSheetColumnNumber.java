// Last updated: 09/07/2026, 09:49:49
class Solution {
    public int titleToNumber(String str) {
         int res=0;
            for(char i: str.toCharArray()){
                res=res*26 + (i-'A'+1);

    }
    return res;
    }
}