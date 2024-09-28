class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rmin=0, rmax=matrix.length-1;
        int cmin=0, cmax=matrix[0].length-1;
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        List<Integer>result=new ArrayList<>();

        while(count<n*m){
            //top boundary
            for(int col=cmin;col<=cmax && count<n*m ;col++){
                result.add(matrix[rmin][col]);
                count++;
            }
            rmin++;
            //right boundary
            for(int row=rmin;row<=rmax && count<n*m; row++){
                result.add(matrix[row][cmax]);
                count++;
            }
            cmax--;
            //bottom boundary
            for(int col=cmax;col>=cmin && count<n*m;col--){
                result.add(matrix[rmax][col]);
                count++;
            }
            rmax--;
            //left boundary
            for(int row=rmax;row>=rmin && count<n*m;row--){
                result.add(matrix[row][cmin]);
                count++;
            }
            cmin++;
        }
        return result;

    }
}
