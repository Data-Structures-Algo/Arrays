/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using //only constant extra space.//
*/
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Boolean>seen=new HashMap<>();
        for(int num:nums){
            if(seen.containsKey(num)){
                return num;
            }
            seen.put(num,true);
        }
        return -1;
    }
}

public class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1, right = nums.length - 1;  // Values are in the range 1 to n
        
        while (left < right) {
            int mid = left + (right - left) / 2;  // Find the middle of the range
            int count = 0;
            
            // Count how many numbers are less than or equal to mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            // If count is greater than mid, duplicate must be in the left half
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;  // The point where the duplicate is found
    }
}
