import java.util.List;
import java.util.Map;
import java.util.*;

public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        if(arr==null || n==0){
            return 0;
        }
        int uniqueIndex=0; //place the next unique element

        for(int i=1;i<arr.length;i++){ 
            //if the current element is diff from last one
            if(arr[i]!=arr[uniqueIndex]){ 
                uniqueIndex++;
                arr[uniqueIndex]=arr[i]; //move unique index to next
            }
        }
        return uniqueIndex+1; 
        //length of array with unique elements

    }
}
