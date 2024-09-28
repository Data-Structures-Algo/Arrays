
import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(arr);

        // Loop through each element
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop starts from the next element
            for (int j = i + 1; j < arr.length; j++) {
                int currSum = arr[i] + arr[j];

                if (currSum == s) {
                    result.add(new int[]{arr[i], arr[j]});
                } else if (currSum > s) {
                    break;  // No need to check further as the array is sorted
                }
            }
        }

        return result;
    }
}
