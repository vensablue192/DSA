/*Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element 
 * from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 * 
 * Problem Constraints
1 <= n <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A=[2, 1, 6, 4]
Input 2:

A=[1, 1, 1]


Example Output
Output 1:
1
Output 2:

3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.
 * 
 * */
package com.venkatsca.prefixArray;

import java.util.Arrays;

public class SpecialIndex {

	public static void main(String[] args) {
		
		int[] A= {1,1,1};
		System.out.println("...." +countOfSpecialIdx(A));
	}
	
	public static int countOfSpecialIdx(int[] A) {
		
		int n=A.length;
		
		int cntSpecialIdx=0;
		int sumEvenIdxEle=0;
		int sumOddIdxEle=0;
		
		int[] prfSumEven = prefixSumEvenArr(A);
		int[] prfSumOdd = prefixSumOddArr(A);
		
		//Check for removal of index
		for(int i=0;i<n;i++) {
			
			if(i==0) {
				sumEvenIdxEle=prfSumOdd[n-1] - prfSumOdd[i];
				sumOddIdxEle = prfSumEven[n-1] - prfSumEven[i];
			}
			else {
				sumEvenIdxEle=prfSumEven[i-1] + prfSumOdd[n-1] - prfSumOdd[i];
				sumOddIdxEle =prfSumOdd[i-1] +  prfSumEven[n-1] - prfSumEven[i];
				
			}
			
			if(sumEvenIdxEle == sumOddIdxEle) {
				cntSpecialIdx++;
				
			}
				
		}
		
		
		
		return cntSpecialIdx;
	}

	private static int[] prefixSumEvenArr(int[] actualArr) {
		int len=actualArr.length;
		
		int[] prefSumEvenArr=new int[len];
		prefSumEvenArr[0]=actualArr[0];
		for(int i=1;i<len;i++) {
			if(i%2==0) {
				prefSumEvenArr[i] = prefSumEvenArr[i-1]+actualArr[i];
				
			}
			else {
				prefSumEvenArr[i] = prefSumEvenArr[i-1];
			}
			
		}
		
		
		return prefSumEvenArr;
	}

	private static int[] prefixSumOddArr(int[] actualArr) {
		int len=actualArr.length;
		int[] prefSumOddArr=new int[len];
		prefSumOddArr[0]=0;
		for(int i=1;i<len;i++) {
			if(i%2==1) {
				prefSumOddArr[i] = prefSumOddArr[i-1]+actualArr[i];
				
			}
			else {
				prefSumOddArr[i] = prefSumOddArr[i-1];
			}
			
		}
		
		return prefSumOddArr;
	}
}
