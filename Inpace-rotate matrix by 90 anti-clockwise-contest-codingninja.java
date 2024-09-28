/* to do this:
1- transpose of the matrix
The nested loop for (int i = 0; i < n; i++) and for (int j = i; j < n; j++) is used to swap the elements across the diagonal, effectively transposing the matrix.
2-rever the column of the matrix (since it asked anticlockwise / if clockwise then row vise reverse will be needed)
he second nested loop for (int i = 0; i < n; i++) and for (int j = 0; j < n / 2; j++) reverses the elements in each column.
The correct index for swapping should be arr[j][i] with arr[n - j - 1][i] to reverse the column properly.*/
import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static void inplaceRotate(int[][] arr, int n) {
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n/2;j++){
				int temp=arr[j][i];
				arr[j][i]=arr[n-j-1][i];
				arr[n-j-1][i]=temp;
		
			}
		}

	}
}
