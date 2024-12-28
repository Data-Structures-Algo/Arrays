class Solution {
    public int maxFrequency(int[] nums, int k) {
        //using sliding window
        Arrays.sort(nums);
        int left=0; //window start
        int maxfreq=0; 
        long sum=0;
        //add current element to the sum
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            //check if the current window is valid?
            while((long)nums[right]*(right-left+1)-sum>k){
                sum-=nums[left];
                left++;
            }

            maxfreq=Math.max(maxfreq,right-left+1);
        }
        return maxfreq; //ans=largest window size
    } 
}
/*(Window size)×(Maximum number in the window)−Sum of numbers in the window≤k
This formula calculates the total increments needed to make all numbers in the window equal to the largest number in the window.*/ 
