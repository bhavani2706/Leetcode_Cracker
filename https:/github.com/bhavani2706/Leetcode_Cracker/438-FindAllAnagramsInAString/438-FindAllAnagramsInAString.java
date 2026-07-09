// Last updated: 09/07/2026, 09:48:51
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = p.length();
        for (int i = 0; i <= s.length() - n; i++) { 
            boolean x = isanagram(i, i + n, s, p);
            if (x) list.add(i);
        }
         return list;
    }   
     static boolean isanagram(int start, int end, String s, String p) {
        int[] arr = new int[26];

        for (int i = 0; i < p.length(); i++) { 
            arr[p.charAt(i) - 'a']++;
        }

for (int i = start; i < end; i++) {
            arr[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}