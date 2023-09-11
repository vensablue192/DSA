/*You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 * Return the second largest element. If no such element exist then return -1.
 * */

package com.venkates.Arrays;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] A= {4};
		System.out.println("Second largest " + secondLargest(A));

	}
	
	public static int secondLargest(int[] A) {
		int result=-1;
		int highest = -1;
		int secondhighest = -2;
		if(A.length > 1) {
		for(int i: A) {
			if(i > highest) {
				secondhighest=highest;
				highest=i;
			}
			else if(i > secondhighest && i != highest) {
				secondhighest=i;
			}
		}
		result=secondhighest;
	 }
		return result;	

	}
	

}