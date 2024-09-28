import java.util.*;

public class Solution {
    
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        //sets for union and intersection
        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        
        //the union set
        for (int i = 0; i < n; i++) {
            unionSet.add(arr1.get(i));
        }
        
        // intersection, and add to union set
        for (int i = 0; i < m; i++) {
            unionSet.add(arr2.get(i));  // distinct elements in the union
            if (arr1.contains(arr2.get(i))) {
                intersectionSet.add(arr2.get(i));  // Add to intersection if common
            }
        }
        
  
        ArrayList<Integer> result = new ArrayList<>();
        result.add(intersectionSet.size());  // Number of common elements
        result.add(unionSet.size());         // Number of distinct elements in union
        
        return result;
    }
}
