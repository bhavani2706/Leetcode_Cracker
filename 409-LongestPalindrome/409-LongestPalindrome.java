// Last updated: 09/07/2026, 10:02:59
class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] charCount = new int[128]; 

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int length = 0;
        int oddCount = 0; 

        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount > 0) {
            length = s.length() - oddCount + 1;
        } else {
            length = s.length();
        }

        return length;
    }
}