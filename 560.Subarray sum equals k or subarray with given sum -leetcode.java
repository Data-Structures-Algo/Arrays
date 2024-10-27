class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;

        HashMap<Integer,Integer>sumMap=new HashMap<>();
        sumMap.put(0,1);//for the case when sum equals k at any point sum=0,frequency=1
        for(int num:nums){
            sum+=num;
            if(sumMap.containsKey(sum-k)){ //if sum-k=0 that means sum==k which is present in map
                count+=sumMap.get(sum-k); //update count if present
            }
            sumMap.put(sum,sumMap.getOrDefault(sum,0)+1); //else put the new sum in map
        }
        return count;
    }
}
/*
We use a hashmap (sumMap) to store cumulative sums and their frequencies as we iterate through the array. For each element, we:

Calculate the cumulative sum (sum).
Check if (sum - k) exists in sumMap. If it does, it means there are subarrays ending at the current index that sum to k, so we add sumMap.get(sum - k) to our count.
Update sumMap with the current sum to track cumulative sums.
This approach finds all subarrays summing to k efficiently in 
𝑂
(
𝑛
)
O(n) time.
*/
