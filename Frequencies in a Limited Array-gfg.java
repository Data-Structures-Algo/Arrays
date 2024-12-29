class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            result.add(map.getOrDefault(i,0));
        }
        return result;
        
    }
}
