class Solution {
    int maxLen(int arr[]) {
        // code here
        int sum=0;
        int maxi=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(map.get(sum) != null){
                    maxi=Math.max(maxi, i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
}
