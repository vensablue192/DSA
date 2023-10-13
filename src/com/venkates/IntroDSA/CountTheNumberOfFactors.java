package com.venkates.IntroDSA;

public class CountTheNumberOfFactors {

	public static void main(String[] args) {
		System.out.println(countTheFactors(100));
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
/* Approach : 
 * 
 * Number = 9
 * 
 * Finding out the number of iterations required:
 * 
 * i     number/i
 * -----------------
 * 1      9
 * 3      3
 * 9      1
 * 
 * repetition point (deciding the number of iterations required):	
 * i > number/i
 * i^2 > number
 * i > square root ( number )
 * 
 * -------------------------------
 * 
 * Example to explain the counter logic
 * number = 100
 * i     number/i
 * ------------------------
 * 1 -- 100   ==> count = +2 n%i = 0 && i != number%i
 * 2 -- 50	  ==> count = +2 n%i = 0 && i != number%i
 * 4 -- 25    ==> count = +2 n%i = 0 && i != number%i
 * 5 -- 20    ==> count = +2 n%i = 0 && i != number%i
 * 10 --10    ==> count = +1   
 * 
 *
 * 
 * 
 * */
 