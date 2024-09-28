class Solution {
    public int search(int[] nums, int target) {
        int minidx = findMin(nums);
        
        //target in the left half or right half
        int ans = binarySearch(nums, 0, minidx - 1, target); //left sorted part
        if (ans == -1) { // If not found-> right sorted part
            ans = binarySearch(nums, minidx, nums.length - 1, target);
        }
        
        return ans;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    private int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated, return 0
        if (nums[left] <= nums[right]) {
            return 0;
        }

        //smallest element
        while (left < right) {
            int mid = (left +right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1; //smallest element is in the right part
            } else {
                right = mid; //smallest element is in the left part
            }
        }
        return left; // Left will point to the minimum element
    }
}
