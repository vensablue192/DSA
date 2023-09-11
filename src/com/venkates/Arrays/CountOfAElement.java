/*Given an array A and an integer B, find the number of occurrences of B in A.*/
package com.venkatsca.Arrays;

public class CountOfAElement {

	public static void main(String[] args) {
		int[] array= {49 , 23, 58, 49 ,46, 52};
		int B=49;
		System.out.println("Count of occurences of "+ B +" is "+ countOfOccurrence(array, B));
	}
	
	public static int countOfOccurrence(int[] A,int B) {
		int count=0;
		for(int i=0;i<A.length;i++) {
			if(A[i] == B) {
				count++;
			}
		}
		return count;
	}

}
