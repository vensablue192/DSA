/*Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.

Problem Constraints
1 <= |A| <= 100000
-10^9 <= A[i] <= 10^9

Input Format
The only argument given is the integer array A.

Output Format
Return whether the given array contains a subarray with a sum equal to 0.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
Input 2:
A = [4, -1, 1]

Example Output
Output 1:
 0
Output 2:
1

Example Explanation
Explanation 1:
No subarray has sum 0.

Explanation 2:
The subarray [-1, 1] has sum 0.
*/

package com.venkates.HashingBasics;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		ArrayList<Integer>  A= new ArrayList<Integer>();
				
		//A.add(1); A.add(2); A.add(3); A.add(4); A.add(5);
		//A.add(4); A.add(-1); A.add(1);
		A.add(1);A.add(-1);
		System.out.println(subArrayWithSumZero(A));

	}
	
	  public static int subArrayWithSumZero(ArrayList<Integer> A) {
		  int length=A.size();
		  	  
		  HashSet<Long> preSumSet = new HashSet<Long>();
		  
		  long x=A.get(0);
		  preSumSet.add(x);
		  
		  for(int i=1; i <length ; i++) {
				x+= A.get(i);				
				if(preSumSet.contains(x)) return 1;
				if(x==0) return 1;
				else preSumSet.add(x);
				
		  }
			return 0;  
	     
	  }

}
