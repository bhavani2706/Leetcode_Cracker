// Last updated: 09/07/2026, 10:00:16
class Solution {
    public int numberOfSpecialChars(String word) {
      HashSet<Character> s=new HashSet<>();
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        s.add(ch);
       }
       int count=0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.contains(ch) && s.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }
      return count;     
    }
}