/*You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:

A = [2, 2, 2]
B = [[0, 0], [1, 2]]


Example Output
Output 1:
[10, 5]
Output 2:
[2, 4]

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N


*/
package com.venkatsca.prefixArray;

import java.util.Arrays;

public class RangeSumQuery {

	public static void main(String[] args) {
			int[] A= {7,3,1,5,5,5,1,2,4,5};
			int[][] B = {{6,9},{2,9},{2,4},{0,9}};
			rangeSum(A,B);
	}
	
	public static long[] rangeSum(int[] A, int[][] B) {
		int givenArrayLength = A.length;
		int queryArrayLength = B.length;
		
		long[] resultArray = new long[queryArrayLength];
		int l=0;
		int r=0;
			
		//Creating prefix Summary Array
		long[] prefixSumArray = new long[givenArrayLength];
		prefixSumArray[0]=A[0];
		for(int i=1; i <givenArrayLength ; i++) {
			prefixSumArray[i] = prefixSumArray[i-1]+A[i];
		}
		// 
		for(int j=0;j < queryArrayLength;j++) {
			l=B[j][0];
			r=B[j][1];
			if(l==0)
			{
				resultArray[j]= prefixSumArray[r];
			}
			else {
				resultArray[j] = prefixSumArray[r]-prefixSumArray[l-1];
			}	
		}
		
		
		return resultArray;
    }
	

}
