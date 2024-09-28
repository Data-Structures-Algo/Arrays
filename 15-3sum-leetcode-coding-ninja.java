import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    ArrayList<ArrayList<Integer>>result=new ArrayList<>();
		Arrays.sort(arr);

		for(int i=0;i<arr.length-2;i++){
			if(i>0 && arr[i]==arr[i-1]){ //skip duplicates
				continue;
			}
			int left=i+1;
			int right=arr.length-1;
			while(left<right){
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==K){
					ArrayList<Integer>triplet=new ArrayList<>();
					triplet.add(arr[i]);
					triplet.add(arr[left]);
					triplet.add(arr[right]);
					result.add(triplet);

				while(left<right && arr[left]==arr[left+1]){ //skip duplicates
					left++;
				}
				while(left<right && arr[right]==arr[right-1]){ //skip duplicates
					right--;
				}
				left++;
				right--;
				}
				
				
				else if(sum<K){
					left++;
				}else{
					right--;
				}
			}
		}
		return result;

	}
}
