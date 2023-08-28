/*Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.*/
package com.venkatsca.Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int rotations = 3;
		System.out.println("Reversed " + rotations + " times "+Arrays.toString(rotateArr(arr, rotations)));

	}
	
	public static int[] rotateArr(int A[],int b) {
		int lenArrayA= A.length-1;
		b=b%lenArrayA;
		ReverseArrayElements.revElementsINSpeciefiedRange(A, 0,lenArrayA);
		ReverseArrayElements.revElementsINSpeciefiedRange(A, 0, b-1);
		int[] reversedNoOfTimesArray = ReverseArrayElements.revElementsINSpeciefiedRange(A, b, lenArrayA);
		
		return reversedNoOfTimesArray;
		
	}

}
