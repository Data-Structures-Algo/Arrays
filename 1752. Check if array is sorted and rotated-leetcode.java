class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        if (nums[0] < nums[nums.length - 1]) {
            count = 1;
        }
        // check if there are one or more breaking points
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }

        }
        //if exactly 1 or less breaking point then it is true
        return count <= 1;

    }
}
