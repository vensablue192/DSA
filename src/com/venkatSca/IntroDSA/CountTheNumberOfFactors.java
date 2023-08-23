package com.venkatSca.IntroDSA;

public class CountTheNumberOfFactors {

	public static void main(String[] args) {
		System.out.println(countTheFactors(9));
	}

	public static int countTheFactors(int number) {
		int count=0;
		int iterations = (int)Math.sqrt(number);
		System.out.println("iterations ..."+iterations);
		for(int i=1;i <= iterations;i++) {
			if(number%i == 0) {
			if(i != number/i) {
				count = count + 2;	
			}
			else{
				count++;
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
 * 1 -- 100   ==> count = +2 n%i = 0 && number != number%i
 * 2 -- 50	  ==> count = +2 n%i = 0 && number != number%i
 * 4 -- 25    ==> count = +2 n%i = 0 && number != number%i
 * 5 -- 20    ==> count = +2 n%i = 0 && number != number%i
 * 10 --10    ==> count = +1   
 * 
 *
 * 
 * 
 * */
 