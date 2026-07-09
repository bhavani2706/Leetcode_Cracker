// Last updated: 09/07/2026, 09:50:34
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int j=0;
        Sub(nums, j, new ArrayList<>(), result);
        return result;
    }
 public void Sub(int[] nums, int j, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = j; i < nums.length; i++) {
            current.add(nums[i]);
            Sub(nums, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}