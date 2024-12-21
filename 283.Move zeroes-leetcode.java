class Solution {
    public void moveZeroes(int[] nums) {
        int index=0; //pointer to place zeroes
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i]; //moving all non-zeroes to front
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0; //zeroes to right end
            index++;
        }
        
    }
}
