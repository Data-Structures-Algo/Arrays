class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n=arr.size();
        if(m>n){
            return -1;
        }
        Collections.sort(arr);
        int mindifference=Integer.MAX_VALUE;
        
        for(int i=0;i<=n-m;i++){
            int diff=arr.get(i+m-1)-arr.get(i);
            mindifference=Math.min(mindifference,diff);
        }
        return mindifference;
    }
}
