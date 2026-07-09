// Last updated: 09/07/2026, 09:47:36
class Solution {
    public int[] sortByBits(int[] arr) {
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
         int num1=Integer.bitCount(arr[i]);
         int num2=Integer.bitCount(arr[j]);
         if(num1>num2 || (num1==num2 && arr[i]>arr[j])){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
        }
     } 
     return arr;  
    }
}