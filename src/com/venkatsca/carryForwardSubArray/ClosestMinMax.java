	/*
	 * Problem Description Given an array A, find the size of the smallest subarray such that it contains at least one occurrence
	 * of the maximum value of the array and at least one occurrence of the minimum value of the array.
	 * 
	 * Problem Constraints 1 <= |A| <= 2000
	 * 
	 * Input Format First and only argument is vector A
	 * 
	 * Output Format Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element 
	 * of the array
	 * 
	 * 
	 * Example Input Input 1:
	 * 
	 * A = [1, 3, 2] Input 2:
	 * 
	 * A = [2, 6, 1, 6, 9]
	 * 
	 * 
	 * Example Output Output 1:
	 * 
	 * 2 Output 2:
	 * 
	 * 3
	 * 
	 * 
	 * Example Explanation Explanation 1:
	 * 
	 * Take the 1st and 2nd elements as they are the minimum and maximum elements
	 * respectievly. Explanation 2:
	 * 
	 * Take the last 3 elements of the array.
	 * 
	 * 
	 * 
	 * Expected Output Provide sample input and click run to see the correct output
	 * for the provided input. Use this to improve your problem understanding and
	 * test edge cases
	 */
package com.venkatsca.carryForwardSubArray;

import java.util.ArrayList;
import java.util.Collections;

public class ClosestMinMax {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(4);
		al.add(4);
		al.add(4);
		al.add(4);
		
		System.out.println(".."+minMaxSubArray(al));
	}
	
	private static int minMaxSubArray(ArrayList<Integer> A) {
			
		int lenOfArray=A.size();
		
		
		
		int las_min_index=-1;
		int las_max_index=-1;
		
		Integer[] array=new Integer[lenOfArray];
		for (int i = 0; i < lenOfArray; i++)
            array[i] = A.get(i);
		
		int arrSize = array.length;
		
		int minOfArray = Collections.min(A);
		int maxOfArray = Collections.max(A);
		int minLengthSubArray=1;
		if(minOfArray != maxOfArray) {
		minLengthSubArray=lenOfArray;
		for(int i=0;i < arrSize;i++) {
			if(array[i] == minOfArray) {
					las_min_index=i;
					if(las_max_index !=-1) {
						minLengthSubArray = Math.min(minLengthSubArray , i-las_max_index+1) ;
					}
				}
			else if(array[i] == maxOfArray)
			{
				las_max_index=i;
				if(las_min_index !=-1){
					minLengthSubArray=Math.min(minLengthSubArray, i-las_min_index+1);
				}
			}
		}
		
		}
		return minLengthSubArray;
	}	

}
