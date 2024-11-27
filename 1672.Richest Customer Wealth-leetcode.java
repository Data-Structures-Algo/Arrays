class Solution {
    public int maximumWealth(int[][] accounts) {
     
        int maxSum=accounts[0][0];

        for(int row=0;row<accounts.length;row++){
            int currSum=0;
            for(int col=0;col<accounts[row].length;col++){
                currSum += accounts[row][col];
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
        
    }
}
