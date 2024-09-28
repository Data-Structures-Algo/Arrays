public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int currSum=0;
        int maxSum=A.get(0);
        
        for(int i=0;i<A.size();i++){
            currSum += A.get(i);
            if(currSum>maxSum){
                maxSum=currSum;
            }
            
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
