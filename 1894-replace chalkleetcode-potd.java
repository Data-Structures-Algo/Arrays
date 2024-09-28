
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalchalk=0;
        for(int i=0;i<chalk.length;i++){
            totalchalk += chalk[i]; //total chalk needed
        }
        k%=totalchalk; //if k is greater than k mod totalchalk (reduce)
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]){ //find which student will ran out of chalk
                return i;
            }
            k-=chalk[i];
        }
        return -1; //just a safety return
    }
}
