/* 1-Sort the Array: Start by sorting the array. Sorting helps in efficiently skipping duplicate quadruplets and allows the use of the two-pointer technique.

2-Four Nested Loops:
  The outer two loops (i and j) will fix the first two elements of the quadruplet.
  The inner two loops will then find the remaining two elements using a two-pointer approach.
  We start two pointers (left and right) just after j and at the end of the array, respectively, and move them inward based on the sum of the four elements.
3-Skip Duplicates:
After finding a valid quadruplet, increment left and decrement right pointers while skipping duplicate values to ensure all quadruplets are unique.
4-Return Result: Store all unique quadruplets and return them.*/


import java.util.*;
public class Solution {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        List<List<Integer>>result=new ArrayList<>();

        if(nums==null || nums.length<4) return result;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Avoid duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Avoid duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Avoid duplicates for the third number
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Avoid duplicates for the fourth number
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
