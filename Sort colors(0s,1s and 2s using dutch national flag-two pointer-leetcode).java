class Solution {
    public void sortColors(int[] nums) {
        //using dutch national flag
        //moving 0 to left 1 stay mid and 2 to right side of the array using two pointer
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                //swap mid with low
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                //mid forward
                mid++;
            }
            else if(nums[mid]==2){
                //swap high with mid 
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}
