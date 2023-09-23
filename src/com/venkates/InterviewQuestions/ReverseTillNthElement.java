/*
Given Array A. Reverse the first n elements

ex: Array[] A= {4,7,6,9,2,4,3};
o/p : {6,7,4,9,2,4,3}
*/
package com.venkates.InterviewQuestions;

import java.util.Arrays;

public class ReverseTillNthElement {

	public static void main(String[] args) {
		
		int[] a= {23,5,57,14,51,2,8,3};
		int n=4;
		
		System.out.println(Arrays.toString(reverseTillNthElement(a,n)));

	}

	private static int[] reverseTillNthElement(int[] a, int n) {
		int startIdx=0;
		int endIdx = n-1;
		int tmp=0;
		
		while(startIdx < endIdx) {
			tmp=a[startIdx];
			a[startIdx] = a[endIdx];
			a[endIdx] = tmp;
			startIdx++;
			endIdx--;
		}
		
		return a;
	}

}
