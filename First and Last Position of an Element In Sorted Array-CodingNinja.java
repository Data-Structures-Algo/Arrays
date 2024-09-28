import java.util.*;
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first=findFirstOccurence(arr, k);
        int last=findLastOccurence(arr, k);
        return new int[]{first,last};
        
    }
    private static int findFirstOccurence(ArrayList<Integer>arr,int k){
        int start=0;
        int end=arr.size()-1;
        int firstOccurence=-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(mid)==k){
                firstOccurence=mid;
                end=mid-1;
            }
            else if(arr.get(mid)<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return firstOccurence;
    }
    private static int findLastOccurence(ArrayList<Integer>arr,int k){
        int start=0;
        int end=arr.size()-1;
        int lastOccurence=-1;

        while(end>=start){
            int mid=(start+end)/2;
            if(arr.get(mid)==k){
                lastOccurence=mid;
                start=mid+1;
            }
            else if(arr.get(mid)<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return lastOccurence;
    }
    

};
