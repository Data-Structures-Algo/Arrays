class Solution {
    public int maximumProduct(int[] nums) {
        if(nums==null || nums.length<3){
            return -1;
        }
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,
        min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;

        for(int num:nums){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        /*If we have two large negative numbers and a large positive number,
        multiplying these can give a very high positive product.*/
        return Math.max(max1*max2*max3,min1*min2*max1); //return the max of possibilities
        
    }
}
