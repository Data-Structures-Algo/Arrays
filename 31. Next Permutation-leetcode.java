class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2; 
        //traverse for a element who is smaller than its next nums[i]<nums[i+1] {1,2,3} here pivot is 2
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //now check for element is larger than nums[i] {3>2 }
        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            //swap nums[i] and element who's larger than nums[i] {swap 2 and 3}
            swap(nums,i,j); //{1,3,2}
        }
        //such i is not found means whole array is sorted in decreasing order simply reverse that
        reverse(nums,i+1,n-1); //{if it were like [3,2,1] then ans -> [1,2,3]}
    }
    private void swap(int[]nums, int i, int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }
    private void reverse(int[] nums,int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
