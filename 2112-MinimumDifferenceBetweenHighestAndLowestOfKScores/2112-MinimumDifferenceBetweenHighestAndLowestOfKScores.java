// Last updated: 09/07/2026, 10:00:57
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        if(k==1)
        return 0;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i+k<=n;i++){
                 diff=Math.min(diff,nums[i+k-1]-nums[i]);
            
        }
        return diff;
    }
}