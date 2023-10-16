/*
Problem Description
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
Problem Constraints
1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105


Input Format
First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.


Output Format
Return an array of integers containing frequency of the each element in B.


Example Input
Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]


Example Output
Output 1:
[3, 1]
Output 2:
[0, 2]


Example Explanation
For Input 1:
The frequency of 1 in the array A is 3.
The frequency of 2 in the array A is 1.
For Input 2:
The frequency of 3 in the array A is 0.
The frequency of 2 in the array A is 2.
*/
package com.venkates.HashingBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElementQuery {

	public static void main(String[] args) {
		List<Integer> input1=new ArrayList<Integer>();
		List<Integer> query1=new ArrayList<Integer>();
		input1.add(1); input1.add(2); input1.add(1); input1.add(1);
		query1.add(1); query1.add(2);
	
		/*- 
		List<Integer> input2=new ArrayList<Integer>();
		List<Integer> query2=new ArrayList<Integer>();
		input2.add(2);input2.add(5);input2.add(9);input2.add(2);input2.add(8);
		query2.add(3); query2.add(2);
		*/
		
		System.out.println(frequencyOfElementQuery((ArrayList<Integer>)input1, (ArrayList<Integer>)query1));
	
	}
	
	 public static ArrayList<Integer> frequencyOfElementQuery(ArrayList<Integer> A, ArrayList<Integer> B) {
		 
		 int n=A.size();
		 int q=B.size();
		 List<Integer> resultList2 = new ArrayList<Integer>();
		 
		 Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		 
		 for(int i=0;i<n;i++) {
			 if(!m1.containsKey(A.get(i))== true) {
				 m1.put(A.get(i), 1);
			 }
			 else {
				 m1.computeIfPresent(A.get(i), (k,v) -> v+1);
			 }
		 }
		
		 
		for(int j=0;j<q;j++) {
			if(m1.containsKey(B.get(j))) {
				resultList2.add(m1.get(B.get(j)));
			}
			else {
				resultList2.add(0);
			}
		}
	
		 return (ArrayList<Integer>) resultList2 ;
		 
	 }

}
