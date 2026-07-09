// Last updated: 09/07/2026, 10:00:39
class Solution {
    public boolean strongPasswordCheckerII(String pas) {
                int u=0,l=0,d=0,s=0;
                   if(pas.length()<8) return false;
                    for(int i=0;i<pas.length();i++){
                        char t=pas.charAt(i);
                        if(i>0 && t== pas.charAt(i-1)) return false;
                        if(t>='A'&& t<='Z')u++;
                        else if(t>='a'&& t<='z') l++;
                        else if(t>='0'&& t<='9') d++;
                        else s++;
                        
                    }
                    return(u>0&& l>0 && s>0 && d>0);
                    }
    }