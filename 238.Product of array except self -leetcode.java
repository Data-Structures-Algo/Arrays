class Solution {
    public int[] productExceptSelf(int[] nums) {
        //ex-nums=[1,2,3,4]
        int n= nums.length;
        int[] ans=new int[n];

        //solved using left-lefthandside product  and right-keeping right variable to track right handisde product 
        //left product 
        ans[0]=1; //since no left product of nums[0]
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];  //{1,1,2,6}
        }

        //right product
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*right;  //{(6*1,right=1*4),(2*4,right=4*3),(1*12,right=2*12),(1*24,right=24)}
            right *= nums[i];
        }
        return ans;
        
    }
}
