/*Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.

*  A = [2, 4, 1, 3, 2]
*  
*  Output = 8
*  
*  We can change the array [4,4,4,4,4]
*/
package com.venkatsca.Arrays;

public class ModifyingToEqual {

	public static void main(String[] args) {
		int[] arr= {2,4,1,3,2};
		System.out.println(secToModifyToEqual(arr));

	}
	
	public static int secToModifyToEqual(int[] A) {
		int seconds=0;
		int highest=Integer.MIN_VALUE;
		for(int i: A) {
			if(i > highest) {
				highest = i;
			}
		}
		for(int i: A) {
			seconds += highest-i;
		}
		
		return seconds;
	}
	

}
