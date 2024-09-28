import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		HashMap<Integer,Integer>map=new HashMap<>();
		int currSum=0;
		int maxLength=0;

		for(int i=0;i<nums.length;i++){
			currSum += nums[i];
			if(currSum==k){
				maxLength=i+1; //update the max length
			}
			if(map.containsKey(currSum-k)){ //if subarry equals to k
				maxLength=Math.max(maxLength,i-map.get(currSum-k));
			}
			if(!map.containsKey(currSum)){ //if not then put in the map
				map.put(currSum,i);
			}

		}
		return maxLength;

		
	}
}
