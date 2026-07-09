// Last updated: 09/07/2026, 10:01:44
class Solution{
    public double average(int[] salary){
        int n=salary.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(salary[j]>salary[j+1]){
                    int temp=salary[j];
                    salary[j]=salary[j+1];
                    salary[j+1]=temp;
                }
            }
        }
        int sum=0;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        return(double)sum/(n-2);
    }
}