/*Given an array A of N integers and also given two integers B and C. 
 * Reverse the elements of the array A within the given inclusive range [B, C].
 * 
 * input :            output
 * A= [1,2,3,4]       
 * B= 2,3
 * */

package com.venkates.Arrays;

import java.util.Arrays;

public class ReverseArrayElements {

	public static void main(String[] args) {
		int[] arr= {4,69,3,6,8,42};
		System.out.println("Reverse elements in a range "+ Arrays.toString(revElementsINSpeciefiedRange(arr,1,2)));
	}

	public static int[] revElementsINSpeciefiedRange(int[] arr,int a,int b) {
		int startIdx = a;
		int endIdx = b;
		int temp =0;
		
		while(startIdx < endIdx) {
			temp = arr[startIdx];
			arr[startIdx] = arr[endIdx];
			arr[endIdx] = temp;
			startIdx++;
			endIdx--;
		}
		
		
		return arr;
	}

}
