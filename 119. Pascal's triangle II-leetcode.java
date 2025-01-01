class Solution {
    public List<Integer> getRow(int rowIndex) {
       long res=1;
       List<Integer>row=new ArrayList<>();
       for(int r=0;r<=rowIndex;r++){
        row.add((int)res);
        res=res*(rowIndex-r)/(r+1);
       }
       return row; 
    }
}
