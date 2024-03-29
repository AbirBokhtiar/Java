package javaProgramming.BitManipulation.UniqueNumber;
import java.util.*;
public class TwoUniqueOptimisation {

	public static void main(String[] args) {
		int[] nums = new int[]{2,11,3,11,7,3,9,2};
        UniqueTwoOp1(nums);
	}
	static void UniqueTwoOp1(int[] nums){     
        /*We use a TreeMap to store the elements
        in the sorted order*/
       TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = nums.length;
     
        /*Iterate through the array and check if each
        element is present or not in the map. If the
      element is present, remove it from the array
      otherwise add it to the map*/
     
        for(int i = 0; i<n; i++){
          if(map.containsKey(nums[i]))
                map.remove(nums[i]);
          else
              map.put(nums[i],1);
      } 
        System.out.println(map.firstKey() + " " + map.lastKey());
  }
	 public static void UniqueTwoOp2(int[] arr, int n)
	    {
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	 
	            // Xor  all the elements of the array
	            // all the elements occurring twice will
	            // cancel out each other remaining
	            // two unique numbers will be xored
	            sum = (sum ^ arr[i]);
	        }
	 
	        // Bitwise & the sum with it's 2's Complement
	        // Bitwise & will give us the sum containing
	        // only the rightmost set bit
	        sum = (sum & -sum);
	 
	        // sum1 and sum2 will contains 2 unique
	        // elements elements initialized with 0 box
	        // number xored with 0 is number itself
	        int sum1 = 0;
	        int sum2 = 0;
	 
	        // traversing the array again
	        for (int i = 0; i < arr.length; i++) {
	 
	            // Bitwise & the arr[i] with the sum
	            // Two possibilities either result == 0
	            // or result > 0
	            if ((arr[i] & sum) > 0) {
	 
	                // if result > 0 then arr[i] xored
	                // with the sum1
	                sum1 = (sum1 ^ arr[i]);
	            }
	            else {
	                // if result == 0 then arr[i]
	                // xored with sum2
	                sum2 = (sum2 ^ arr[i]);
	            }
	        }
	 
	        // print the the two unique numbers
	        System.out.println("The non-repeating elements are "
	                           + sum1 + " and " + sum2);
	    }
}
