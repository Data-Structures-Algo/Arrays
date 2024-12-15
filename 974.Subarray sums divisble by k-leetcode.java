class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1); //map initialized for remainder 0
        for(int num:nums){
            sum+=num;
            int remainder=sum%k; //if sum%k==0 then it is divisible
            if(remainder<0){
                remainder+=k; //if remainder is smaller than zero
            }
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
        
    }
}
