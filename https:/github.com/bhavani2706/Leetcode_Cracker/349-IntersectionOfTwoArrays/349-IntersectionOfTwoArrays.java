// Last updated: 09/07/2026, 09:49:05
import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
  return result;
    }
}
