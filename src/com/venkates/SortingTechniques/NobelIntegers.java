/*Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints
1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is present else, return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

 There exist no integer satisfying the required conditions.
*/


package com.venkates.SortingTechniques;

import java.util.ArrayList;
import java.util.Collections;

public class NobelIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(7);
		al.add(0);
		al.add(9);
		al.add(3);
		al.add(6);
		al.add(0);
		al.add(6);
			
		
		System.out.println(nobleInts(al));

	}
	
	 public static int nobleInts(ArrayList<Integer> A) {
		 Collections.sort(A);
	        int size = A.size();
	        for(int i = 0; i < size; i++){
	        	while(i+1<size && A.get(i)==A.get(i+1))
	        		i++;
	        	if(A.get(i) == size-1-i)
	        		return 1;
	        }
	        return -1;
	  }
}
