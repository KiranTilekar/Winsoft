/* Question : Merge two arrays by satisfying given constraints
              Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
              merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order. */

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		int[] x = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] y = {1, 8, 9, 10, 15};
        
        //remove 0's from x
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num:x)
        {
        	if(num!=0)
        	{
        		list.add(num);
        	}
        }
        
        int[] new_x = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
        	new_x[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(new_x));
        
        // merge arrays
        int[] mergedArray = mergeArrays(new_x,y);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
          
	}


public static int[] mergeArrays(int[] new_x, int[] y) {
    int m = new_x.length;
    int n = y.length;
    
    int[] mergedArray = new int[m + n];
    
    // Copy elements of new_x into mergedArray
    for (int i = 0; i < m; i++) {
        mergedArray[i] = new_x[i];
    }
    
    // Copy elements of y into mergedArray
    for (int i = 0; i < n; i++) {
        mergedArray[m + i] = y[i];
    }
    
    return mergedArray;
}
}
