// Last updated: 09/07/2026, 10:02:47
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
            int j;
            for ( j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    break;
                }
            }
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    res[i] = nums2[k];
                    break;
                }
            }
        }
        return res;
    }
}