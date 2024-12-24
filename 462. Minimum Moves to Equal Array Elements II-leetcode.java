class Solution {
    public int minMoves2(int[] nums) {
        //
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int moves=0;
        for(int i=0;i<nums.length;i++){
            moves+=Math.abs(nums[i]-median);
        }
        return moves;
    }
}
/*The median minimizes the sum of absolute differences from all other elements in the array. Here's why:

If you pick a number smaller than the median, the sum of absolute differences from all elements will increase because more elements are larger than the number you're trying to match.
Similarly, if you pick a number larger than the median, the sum of absolute differences will increase because more elements are smaller than the number you're trying to match.
*/
