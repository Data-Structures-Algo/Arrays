/*
You are playing a video game, which contains an N x N grid. You start on the top left cell of the grid, and are free to move anywhere through the grid, any number of times.

Each cell in the grid has some number of points that you can collect from it and you can collect points at most once from each cell. Furthermore, it is possible to collect points from a cell, if and only if the cell lies on one of the two diagonals of the grid. Print the maximum number of points you can collect, given the grid.

For example:

If the grid is:
1 2
3 4
We can collect points from all cells as each cell lies on a diagonal. So, the maximum points will be 1+2+3+4 = 10.
*/
import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumPoints(int n, int[][] grid)
    {
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=grid[i][i]; //main diagonal
            sum +=grid[i][n-i-1]; //second diagonal 
        }
        if(n%2==1){
            sum -=grid[n/2][n/2]; //if n is odd then remove mid of the diagonal
        }
        return sum;
    }
}