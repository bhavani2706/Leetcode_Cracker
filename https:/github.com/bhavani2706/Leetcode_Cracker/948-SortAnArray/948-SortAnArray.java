// Last updated: 09/07/2026, 09:48:04
class Solution {
    public int[] sortArray(int[] arr) {
        split(arr); 
        return arr;       
    } 
    public static void split(int[] arr){
    int length=arr.length;
    if(length<=1) return;
    int mid=length/2;
    int[] leftarray= new int[mid];
    int [] rightarray=new int[length-mid];
    int j=0;
    for(int i=0;i<length;i++){
        if(i<mid){
            leftarray[i]=arr[i];
        }else{
            rightarray[j]=arr[i];
            j++;
        }
    }
    split(leftarray);
    split(rightarray);
    merge(leftarray,rightarray,arr);
}
    public static void merge(int[]leftarray,int[] rightarray,int []arr){
        int lsize=arr.length/2;
        int rsize=arr.length-lsize;
        int i=0,le=0,ri=0;
        while(le<lsize && ri<rsize){
            if(leftarray[le]<rightarray[ri]){
                arr[i]=leftarray[le];
                i++;
                le++;
                
            }else{
                arr[i]=rightarray[ri];
                i++;
                ri++;
            }
        }
        while(le<lsize){
            arr[i]=leftarray[le];
            i++;
            le++;
        }
        while(ri<rsize){
            arr[i]=rightarray[ri];
            i++;
            ri++;
        }
    }
}