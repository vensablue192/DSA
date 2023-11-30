/*Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
The first argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*/
package com.venkates.sorting.quicksortcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(9);
		al.add(0);
		
		System.out.println(LargestNumber.largestNumber(al));
	}
	
	 public static String largestNumber(ArrayList<Integer> A) {
		 
		 Collections.sort(A, new Comparator<Integer>() {
			 	public int compare(Integer a,Integer b) {
			 		String AB=String.valueOf(a)+String.valueOf(b);
			 		String BA=String.valueOf(b)+String.valueOf(a);
			 		return AB.compareTo(BA) > 0 ? -1: 1;
			 	}
		});
		 
		 StringBuilder result=new StringBuilder();
		 for(int x: A) {
			 result.append(String.valueOf(x));
		 }
		 if(result.charAt(0) == '0') {
			 return "0";
		 }
		 
		 return result.toString();
	 }

}
