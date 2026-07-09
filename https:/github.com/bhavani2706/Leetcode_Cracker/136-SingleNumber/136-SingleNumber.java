// Last updated: 09/07/2026, 09:50:06
class Solution {
    public int singleNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int c=0;
             for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])c++;
        }
        if(c==1)
        return arr[i];
        
    }
return 0;
    }
}