//The XOR operation has a unique property: when you XOR two identical numbers, the result is 0, and when you XOR a number with 0, the result is the number itself.

//Thus, if you XOR all the elements of the array, the numbers that appear twice will cancel each other out, and you'll be left with the unique number.
public class Solution{  

    public static int findUnique(int[] arr){
      int uniqueElement=0;

      for(int i=0;i<arr.length;i++){
        uniqueElement ^= arr[i];
      }
      
      return uniqueElement;
    }
}
