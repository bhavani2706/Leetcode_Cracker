// Last updated: 09/07/2026, 09:46:54
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
        if(word.contains(patterns[i])){
            count++;
        }
    }
        return count;
    }
}