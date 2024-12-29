class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int sum=0;
        int maxlen=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        // Initialize the HashMap to handle subarrays starting from index 0
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-map.get(sum-k)); 
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxlen;
    }
}
