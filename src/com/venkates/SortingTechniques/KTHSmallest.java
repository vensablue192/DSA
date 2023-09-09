/*Problem Description
Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= min(|A|, 500)

1 <= A[i] <= 109



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return the Bth smallest element in given array.



Example Input
Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2.*/
package com.venkates.SortingTechniques;

import java.util.ArrayList;
import java.util.List;

public class KTHSmallest {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(5);
		li.add(12);
		li.add(8);
		li.add(-5);
		li.add(4);
		
		System.out.println(kthsmallest(li,4));
	}
	
	  public static int kthsmallest(final List<Integer> A, int B) {
	  List<Integer> A2=new ArrayList<Integer>(A);
	  for(int i=0;i<B;i++) {
		  int minIdx = i;
		  for(int j=i+1;j<A.size();j++) {
			  if (A2. get(j) < A2. get(minIdx))
				  minIdx=j;
	            }
		  
	  	if (i != minIdx) {

		  int temp = A2. get(i);

		  A2.set(i, A2. get(minIdx));

		  A2.set(minIdx, temp);

		  }

		  }

		  return A2.get(B - 1);
	  
	 }
}
