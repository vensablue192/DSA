/*Problem Description
You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space


Problem Constraints
1 <= N <= 104
1 <= A[i] <= 104


Input Format
First argument A is an array of integers.


Output Format
Return an array of integers.


Example Input
Input 1:
A = [6, 8, 9]
Input 2:
A = [2, 4, 7]


Example Output
Output 1:
[9, 6, 8]
Output 2:
[2, 7, 4]


Example Explanation
For Input 1:
The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.
For Input 2:
The number 2 has 2 factors, 7 has 2 factors and 4 has 3 factors.
*/
package com.venkates.sorting.quicksortcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FactorsSort{

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(7);
		
		System.out.println(FactorsSort.factorSort((ArrayList<Integer>) l1));
	}

	  public static ArrayList<Integer> factorSort(ArrayList<Integer> A) {
		  
		Collections.sort(A	,new Comparator<Integer>() {
			public int compare(Integer a,Integer b) {
				if(countTheFactors(a) < countTheFactors(b)) {
					return -1;
				}
				else if(countTheFactors(a) > countTheFactors(b)) {
					return 1;
				}
				else {
					if(a < b) {
						return -1;
					}
					else if(a > b) {
						return 1;
					}
					else {
						return 0;
					}
					
				}
			}
		});  
		
		return A;
		  
	  }
	  
	  public static int countTheFactors(int number) {
			int count=0;
			
			/* Number = 9
			 * Finding out the number of iterations required:
			 * 
			 * i    number/i
			 * 1    9 
			 * 3    3 
			 * 9    1
			 * 
			 * repetition point (deciding the number of iterations required): 
			 * i > number/i
			 * i^2 > number
			 * i > square root ( number )
			 * 
			 */
			
			int iterations = (int)Math.sqrt(number);
			
			for(int i=1;i <= iterations;i++) {
				if(number%i == 0) {
				if(i != number/i) {
					count = count + 2;	
				}
				else{
					count++; // For perfect squares factors will be repeated hence count is incremented by only 1. example 100.
				}
			}
			
		}
			return count;
	}
}
