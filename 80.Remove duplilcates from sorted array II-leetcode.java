// topt interview 150 (Array,two pointer)
class Solution {
    public int removeDuplicates(int[] nums) {
    // If the array has less than 3 elements, no need to process further.
        if (nums.length < 3) return nums.length;

        int writeIndex = 1;

        for (int i = 2; i < nums.length; i++) {
            /* Only write the current element if it is not the same as the element
            two positions before */
            if (nums[i] != nums[writeIndex - 1]) {
                writeIndex++;
                nums[writeIndex] = nums[i];
            }
        }

        return writeIndex + 1;
    }
}
