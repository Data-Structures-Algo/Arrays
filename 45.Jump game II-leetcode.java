class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int currentend=0;
        int farthest=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]); //farthest point reachable
            if(i==currentend){ //need to jump
                jumps++; //increment jumps
                currentend=farthest;

                if(currentend>=nums.length-1){
                    break;
                }
            }

        }
        return jumps;
    }
}
