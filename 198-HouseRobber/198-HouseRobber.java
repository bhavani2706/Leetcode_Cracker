// Last updated: 09/07/2026, 10:03:39
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        
        int arr[]=new int[n+1];
        arr[1]=nums[0];
        for(int i=2;i<=n;i++){
            arr[i]=Math.max(arr[i-1],arr[i-2]+nums[i-1]);
        }return arr[n];
        
    }
}
