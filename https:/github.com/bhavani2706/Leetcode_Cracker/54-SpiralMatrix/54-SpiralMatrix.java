// Last updated: 09/07/2026, 09:50:53
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> res=new ArrayList<>();
         int rowstart=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
            res.add(matrix[rowstart][i]);
                
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                res.add(matrix[i][colend]);
            }
            colend--;
            if(rowstart<=rowend){
            for(int i=colend;i>=colstart;i--){
                res.add(matrix[rowend][i]);
            }
            rowend--;
        }
             if (colstart<=colend) {
             for(int i=rowend;i>=rowstart;i--){
                res.add(matrix[i][colstart]);
            }
            colstart++;
             }
        }  
        return res;
    }
}