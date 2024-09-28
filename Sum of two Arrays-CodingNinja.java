import java.util.*;

public class Solution {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Initialize an array list to store the result
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        
        // Indices for the last elements of arrays a and b
        int i = n - 1;
        int j = m - 1;
        
        // Loop through both arrays from the end towards the beginning
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a[i];
                i--;
            }
            
            if (j >= 0) {
                sum += b[j];
                j--;
            }
            
            // Calculate carry and digit to store
            carry = sum / 10;
            result.add(sum % 10);  // Add the last digit of sum
        }
        
        // The digits in result are in reverse order, so we need to reverse it
        Collections.reverse(result);
        
        // Convert ArrayList to an array
        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }
        
        return resultArray;
    }
}
