class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){ //check if the next consecutive element is bigger 
                profit+=prices[i+1]-prices[i]; //add profit
            }
        }
        return profit;
    }
}
