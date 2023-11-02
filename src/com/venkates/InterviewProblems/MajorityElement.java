/*Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.



Problem Constraints
1 <= N <= 5*105
1 <= num[i] <= 109


Input Format
Only argument is an integer array.


Output Format
Return an integer.


Example Input
Input 1:
[2, 1, 2]
Input 2:
[1, 1, 1]


Example Output
Input 1:
2
Input 2:
1


Example Explanation
For Input 1:
2 occurs 2 times which is greater than 3/2.
For Input 2:
 1 is the only element in the array, so it is majority
*/

package com.venkates.InterviewProblems;

import java.util.Arrays;
import java.util.List;

public class MajorityElement {

	public static void main(String[] args) {
	
		//List<Integer> list=Arrays.asList(3,4,3,6,1,3,2,5,3,3,3);
		List<Integer> list=Arrays.asList(2,1,1);
		System.out.println(list.size()/2);
		
		System.out.println("Majority Element " + majorityElement(list));

	}
	// Moore's Voting algorithm - check scaler notes for explanation
	 public static int majorityElement(final List<Integer> A) {
		
		 int me=A.get(0);
		 int count=0;
		 
			for(Integer B: A) {
					 if(count==0) {
						 me=B;
						 count=1;
					 }
					 else {
						 if(me==B)
						 {
							count++;
						 }
						 else {
							 count--;
						 }
					 }
				}
		 
		// Need to check if ME exists
		count=0;
		for(Integer B: A) {
			if(me==B) count++;
		}
		System.out.println(count);
		if(count > (A.size()/2) ) return me;
			
		 return 0;
	 	 
	 }
	
	// TC - O(N) , SC - O(1)

}
