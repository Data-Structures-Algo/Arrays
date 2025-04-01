class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++; //no carry needed
                return digits;
            }
            digits[i]=0; //carry over -> set current digit to zero
        }
        //if loop ends that means we had a carry from the digit
        int[]result=new int[digits.length+1];
        result[0]=1; //set the digit to 1
        return result;
    }
}
