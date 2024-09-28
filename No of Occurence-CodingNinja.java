/* Just  like leetcode - find first and last postion of an element*/
import java.util.*;

public class Solution {
    public static int count(int arr[], int n, int x) {
        int first = findFirstOccurrence(arr, n, x);
        if (first == -1) {
            return 0; 
        }
        int last = findLastOccurrence(arr, n, x);
        return last - first + 1; // Count of x
    }

    private static int findFirstOccurrence(int arr[], int n, int x) {
        int start = 0, end = n - 1, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                result = mid;
                end = mid - 1; 
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int findLastOccurrence(int arr[], int n, int x) {
        int start = 0, end = n - 1, result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                result = mid;
                start = mid + 1; 
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
