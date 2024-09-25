class Solution {
     public boolean isvalid(int[][] matrix,int y,int x){
        int r=matrix.length;
        int c=matrix[0].length;
        int i=y;
        int j=x;
        int temp=matrix[i][j];
        while(i<r && j<c){
            if(matrix[i][j]!=temp){
                return false;
            }
            i++;
            j++;
        }
        return true;
     }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int j=0;j<c;j++){
            if(!isvalid(matrix,0,j)) 
            return false;
            
        }
        for(int i=1;i<r;i++){
            if(!isvalid(matrix,i,0))
            return false;
        }

      return true;  
    }
}