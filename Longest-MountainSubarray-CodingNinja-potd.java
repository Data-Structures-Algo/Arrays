import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int longestMountain(int arr[], int n)
	{
		if(n<3){
			return 0;
		}
		int longest=0;
		for(int i=1;i<n-1;i++){
			if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
				//expand left to see the start of mountain
				int left=i-1;
				while(left>0 && arr[left]>arr[left-1]){
					left--;
				}
				//expand right to see the end of mountain
				int right=i+1;
				while(right<n-1 && arr[right]>arr[right+1]){
					right++;
				}
				//update currentlength
				int currentMountainLength=right-left+1;
				longest=Math.max(longest, currentMountainLength);

				//move i to the end
				i=right;
			}
		}
		return longest;

	}

}
