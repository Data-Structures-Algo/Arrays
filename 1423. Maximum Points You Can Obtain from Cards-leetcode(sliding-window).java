class Solution {
    public int maxScore(int[] cardpoints, int k) {
        int n=cardpoints.length;
        int totalsum=0;
        for(int num:cardpoints){
            totalsum+=num; 
        }
        int winsize=n-k; //window of size-> n-k
        int currwinsum=0;
        for(int i=0;i<winsize;i++){
            currwinsum+=cardpoints[i]; //windowsum
        }
        int minwinsum=currwinsum; //min windowsum
        for(int i=winsize;i<n;i++){ //slide window
            currwinsum += cardpoints[i]-cardpoints[i-winsize]; // new curr windowsum
            minwinsum=Math.min(currwinsum,minwinsum); // min window sum
        }
        return totalsum-minwinsum;
    }
}
