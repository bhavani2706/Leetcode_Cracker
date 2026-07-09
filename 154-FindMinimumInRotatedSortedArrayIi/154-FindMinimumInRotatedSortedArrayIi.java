// Last updated: 09/07/2026, 10:03:51
class Solution{
    public int findMin(int[] nums){
        int l=0,r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            min=Math.min(min,nums[mid]);
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else if(nums[mid]<nums[r]){
                r=mid-1;
            }else{
                r--;
            }
        }
        return min;
    }
}