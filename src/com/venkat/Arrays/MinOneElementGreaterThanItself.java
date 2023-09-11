/*Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.

A = [3, 1, 2]  -- > 2
A = [5, 5, 3]  -- > 1
*/
package com.venkatsca.Arrays;

public class MinOneElementGreaterThanItself {
	public static void main(String[] args) {
		int[] arr= {3};
		System.out.println(solution(arr));

	}
	
	public static int solution(int[] A) {
		int elementsCount=0;
		int highest=Integer.MIN_VALUE;
		for(int i: A) {
			if(i > highest) {
				highest = i;
			}
		}
		for(int i: A) {
			if(highest-i > 0) {
				elementsCount++;
		}
		}
		
		return elementsCount;
	}

}
