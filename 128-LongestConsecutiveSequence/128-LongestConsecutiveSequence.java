// Last updated: 09/07/2026, 10:04:01


class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==0)return 0;
        int curr_count=1,max_count=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]-1==nums[i-1]) curr_count++;
            else{
                max_count=Math.max(max_count,curr_count);
                curr_count=1;
            }
        }
        return Math.max(max_count,curr_count);
      
     
    }
}