class Solution {
    public boolean canJump(int[] nums) {
        int jump=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>jump){
                return false; //unreachable 
            }
            jump=Math.max(jump,i+nums[i]); //update the jump to the position we can reach
            if(jump>=n-1){
                return true; //it reaches end
            }
        }
        return false;
    }
}
