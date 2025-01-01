class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();

        for(int n=0;n<numRows;n++){
            List<Integer>row=new ArrayList<>();
            for(int r=0;r<=n;r++){
                row.add(combination(n,r));
            }
            result.add(row);
        }
        return result;
    }
    private int combination(int n, int r){
        long res=1; //To avoid overflow during intermediate calculations
        for(int i=0;i<r;i++){
            res=res*(n-i)/(i+1);
        }
        return (int) res;
    }
}
/*Outer Loop (Rows): For each row 𝑛
n from 0 to numRows - 1, calculate all elements in the row.
Inner Loop (Columns): For each column 𝑟
r, calculate nCr using the combination() method.
Instead of calculating factorials directly, use an iterative approach to compute nCr.
nCr is computed as: n/1 *n-2/2 x.... r terms
*/
