// rotating array to the left by k steps;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n=arr.size();
        k=k%n; //handle cases where k>n

        // Reverse the first k elements
        reverseArray(arr, 0, k - 1);
        // Reverse the remaining n - k elements
        reverseArray(arr, k, n - 1);
        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
        
        return arr;
        
    }
    private static void reverseArray(ArrayList<Integer>arr,int start,int end){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
