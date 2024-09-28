class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k % n;

        reverse(nums,0,n-1); // firstly we reverse the whole array
        reverse(nums,0,k-1); // secondly we reverse array upto k 
        reverse(nums,k,n-1); // then the rest of the array after k


    }
    private void reverse(int[]nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
