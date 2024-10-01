import java.util.*; 
import java.io.*;

public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        int i = 0, j = n - 1;
        int count = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                count++;
                i++;
                j--;
            } else if (sum < target) {
                i++; 
            } else {
                j--; 
            }
        }
        
        
        return count == 0 ? -1 : count;
    }
}
