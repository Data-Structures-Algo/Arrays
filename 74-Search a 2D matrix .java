class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;  // Edge case: empty matrix
        }
        
        int i = 0; // start from the first row
        int j = matrix[0].length - 1; // start from the last column

        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){ //if less than target move downwards |
                i++;                                                       //   V
            }else{ //otherwise move towards left <----[i][j] 
                j--;
            }
        }
        return false;
    }
}
