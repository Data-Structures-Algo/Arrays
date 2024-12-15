class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>seen=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i])){ //increment frequency if it is already in it
                int cfreq=seen.get(nums[i]); 
                seen.put(nums[i],cfreq+1);
            }else{
                seen.put(nums[i],1); //add if not in there

            }
            
        }
        for(int num:seen.keySet()){ //loop through map 
            int freq=seen.get(num); //frequency of num in map
            if(freq==2){
                result.add(num);
            }
        }
        return result;
    }
}
