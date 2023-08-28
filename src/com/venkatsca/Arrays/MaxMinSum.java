/*Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.*/
package com.venkatsca.Arrays;

public class MaxMinSum {
	
	public static void main(String[] args) {
		int[] array= {-1,5,9};
		System.out.println("Sum of max and min element in an array"+findSumMaxMin(array));
	}

	private static int findSumMaxMin(int[] array) {
		int min=array[0];
		int max=array[0];
		int sum=0;
		int elements = array.length;
		
		for(int i=0; i < elements ; i++) {
			if(array[i] < min) {
				min=array[i];
			}
		
		else if(array[i] > max){
				max=array[i];
			}
		}
		System.out.println(min + " " + max);
		
		return sum;
	}
	

}
