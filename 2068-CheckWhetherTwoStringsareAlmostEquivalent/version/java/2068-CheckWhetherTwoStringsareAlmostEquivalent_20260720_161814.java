// Last updated: 20/07/2026, 16:18:14
1class Solution{
2    public int firstUniqueEven(int[] nums){
3        int[] count=new int[101];
4        for (int i=0;i<nums.length;i++) {
5            count[nums[i]]++;
6        }
7        for (int i=0;i<nums.length;i++){
8            if(nums[i]%2==0 && count[nums[i]]==1) {
9                return nums[i];
10            }
11        }
12        return -1;
13    }
14}