/* Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
 * Check if any good pair exist or not. Return 1 if a pair exist or 0;
 * 	
 *
 */


package com.venkates.Arrays;

public class FindPairElements {

	public static void main(String[] args) {
		int[] arr= {3,2,5,8,6,1,9};
		System.out.println(findPair(arr,9));
	}
	
	public static int findPair(int[] A,int B ) {
	
		int answer = 0;
		
		for(int i=0; i<A.length;i++) {
			for(int j=i+1; j<A.length; j++) {
				if(i != j && A[i]+A[j] == B) {
					answer=1;
				}
			}
		}
		

	return answer;

	}
}
