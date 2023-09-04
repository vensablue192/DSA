/*Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.


Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106


Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.


Output Format
Return a single integer which denotes the maximum sum.

Example Input
Input 1:
A = 5 , B = 12 , C = [2, 1, 3, 4, 5]
Input 2:
A = 3 , B = 1 , C = [2, 2, 2]

Example Output
Output 1: 12
Output 2: 0
*/

package com.venkates.SlidingWindowAndContributionTechnique;

import java.util.ArrayList;

public class FindMaxSumSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1); 
		al.add(2);
		al.add(4);
		al.add(4);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(7);
		al.add(5);
		
		System.out.println(".."+maxSubarray(9, 14, al));
	}
	
	public static int maxSubarray(int A, int B, ArrayList<Integer> C) {
		
		
		Integer[] array=new Integer[A];
		array=C.toArray(array);
		int answer=0;
		for(int i=0; i < A ;i++) {
			int currSum = 0;
			for(int j=i;j < A;j++) {
			currSum+=array[j];
			
			if(currSum <= B) 
				answer = Math.max(answer, currSum);
			else break;
			}
		}        
			return answer;
    }

}
