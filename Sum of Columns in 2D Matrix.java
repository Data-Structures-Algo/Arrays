//Take 2D matrix A of size N X M as an input and print M integers denoting the column-wise sum of each of the M columns.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        int[][]A=new int[N][M];
        int[] sum=new int[M];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int values=sc.nextInt();
                sum[j] += values;
            }
        }
        for(int j=0;j<M;j++){
            System.out.print(sum[j]+" ");
        }
        
        
    }
}
