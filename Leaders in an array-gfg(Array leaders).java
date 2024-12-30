class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>result=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        return result;
        
    }
}
