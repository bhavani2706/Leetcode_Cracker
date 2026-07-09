// Last updated: 09/07/2026, 10:03:46
class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
        int count=0;
             for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
 }
                if(count>max){
                    max=count;
res=nums[i];
                    }
              }
             }
                return  res;
    }
}