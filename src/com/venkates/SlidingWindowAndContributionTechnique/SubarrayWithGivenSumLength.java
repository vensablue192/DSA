/*Problem Description
Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 104

1 <= B <= N

1 <= C <= 109



Input Format
First argument A is an array of integers.

The remaining arguments B and C are integers



Output Format
Return 1 if such a subarray exist and 0 otherwise


Example Input
Input 1:
A = [4, 3, 2, 6, 1]
B = 3
C = 11
Input 2:

A = [4, 2, 2, 5, 1]
B = 4
C = 6


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
The subarray [3, 2, 6] is of length 3 and sum 11.
Explanation 2:
There are no such subarray.
*/
package com.venkates.SlidingWindowAndContributionTechnique;

import java.util.ArrayList;

public class SubarrayWithGivenSumLength {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		/*
		 * al.add(4); al.add(3); al.add(2); al.add(6); al.add(1); // params 3 , 11
		 */		 
		
		
		/*
		 * al.add(4); al.add(2); al.add(2); al.add(5); al.add(1); // params 4,6
		 */		 		 
		al.add(6); // params 1,6
		System.out.println("..result"+subArrayWithGivenSumLength(al,1,6));

	}
	 public static  int subArrayWithGivenSumLength(ArrayList<Integer> A, int B, int C) {
		 int result=0;
		 int actArryLen=A.size();
		 
		 Integer[] array = new Integer[actArryLen];
		 array=A.toArray(array);
		 
		 for(int i=0;i < actArryLen; i++) {
			 int currentArraySum=0;
			 for(int j=i; j< i+B && i+B<=actArryLen;j++) {
				 currentArraySum+=array[j];
			 } 
			 if(currentArraySum == C) {
				result=1;
				break;
			}
				 
		}
		 return result;
			 
	}
		 
		 
		 
	 
	
}
