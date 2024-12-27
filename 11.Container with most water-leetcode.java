class Solution {
    public int maxArea(int[] height) {
        //max area=max water
       int maxwater=0;
       int left=0;
       int right=height.length-1;
       while(left<right){
        int width=right-left;
        int ht=Math.min(height[left],height[right]); 
        //since the wall that holds the water is the lower one
        int currentwater=width*ht;
        maxwater=Math.max(maxwater,currentwater);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
       }
       return maxwater;
    }
}
