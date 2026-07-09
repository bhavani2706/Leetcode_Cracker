// Last updated: 09/07/2026, 09:47:53
class Solution {
    public void move(int[] arr,int i) {
        for(int j=arr.length-1; j>i ;j--){
            arr[j]=arr[j-1];

        }
        
    }
    public void duplicateZeros(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                move(arr,i);
                if(i!=arr.length-1){
                    arr[i+1]=0;
                    i++;
                }
                }    }
    }
}