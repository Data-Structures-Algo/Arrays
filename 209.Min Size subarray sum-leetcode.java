/*Top Interview 150*/
/*Sliding Window:
We iterate over the array with an end pointer that expands the window by adding nums[end] to currSum.
Inside the loop, we use a while loop to shrink the window from the left (by moving the start pointer) as long as the currSum is greater than or equal to the target.

Update Minimal Length:
Each time the currSum meets or exceeds target, we update minLength to be the smaller of its current value and the current window size (end - start + 1).

Return Result:
After the loop, if minLength was updated, return it; otherwise, return 0,


*/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum=0;
        int minLength=Integer.MAX_VALUE;
        int start=0;

        for(int end=0;end<nums.length;end++){
            currSum += nums[end];
            while(currSum>=target){ 
                // Shrink the window as small as possible while the sum is still >= target
                minLength=Math.min(minLength,end-start+1);
                currSum -= nums[start];
                start++;
            }
        }
         // If minLength was not updated, return 0, meaning no such subarray exists
        return minLength==Integer.MAX_VALUE ? 0 : minLength;


        
    }
}
