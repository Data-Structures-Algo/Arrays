class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        boolean firstrowiszero=false, firstcoliszero=false;
        //if 1st row needs to be zero
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstrowiszero=true;
                break;
            }
        }
        //if 1st col needs to be zero
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstcoliszero=true;
                break;
            }
        }
        //mark the rows and cols to be zero
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        //set zeroes based on markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //set first row zero if needed
        if(firstrowiszero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        //set first col zero if needed
        if(firstcoliszero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}
