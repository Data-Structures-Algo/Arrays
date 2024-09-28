/* MOORE-Voting Algorithm
Phase 1 (Candidate Selection): The first loop runs to select a potential candidate. It reduces the count if the current element is different from the candidate, and resets the candidate if the count reaches zero.
Phase 2 (Candidate Validation): After selecting a candidate, the second loop verifies if the candidate appears more than n / 2 times. */
import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		int candidate=arr[0];
		int count=1; //intial count

		for(int i=0;i<n;i++){
			if(arr[i]==candidate){
				count++; //update count if it is the candidate
			}
			else{
				count--;
			}
			if(count==0){
				candidate=arr[i]; //if count is zero then candidate is the current element
				count=1;
			}
		}
		//verify candidate
		count=0;
		for(int val: arr){
			if(val==candidate){ 
				count++;
			}
		}
		if(count>n/2){
			return candidate; //if count is n/2 the we have our candidate
		}
		return -1;
		
	}
}
