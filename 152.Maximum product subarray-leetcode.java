class Solution {
    public int maxProduct(int[] nums) {
        int minProd=nums[0];
        int maxProd=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            // Swap max and min when encountering a negative number
            if(nums[i]<0){
                int temp=maxProd;
                maxProd=maxProd;
                minProd=temp;
            }

            maxProd=Math.max(nums[i],maxProd*nums[i]);
            minProd=Math.min(nums[i],minProd*nums[i]);
            result=Math.max(maxProd,result);
        }
        return result;
        
        
    }
}
/*In the context of finding the maximum product of a contiguous subarray, the purpose of maxProd and minProd is:

maxProd: Tracks the maximum product of subarrays ending at the current index. It helps to identify the highest product that can be formed with positive and negative numbers.

minProd: Tracks the minimum product of subarrays ending at the current index. This is crucial when the current number is negative because multiplying two negative numbers results in a positive product. By keeping track of the minimum product, you can correctly calculate the maximum product when encountering negative numbers.

Summary:
Using both maxProd and minProd allows the algorithm to efficiently handle arrays with both positive and negative values, ensuring that the overall maximum product is accurately determined.
*/
