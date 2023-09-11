package com.venkates.IntroDSA;

public class SumPrimeNumbers {

	public static void main(String[] args) {
		System.out.println(sumPrimeNumbers(1));

	}
	
	public static int sumPrimeNumbers(int number) {
		int sumPrimeNumbers=0;
		int count=0;
		for(int i=2 ; i<=number; i++) {
			for(int j=2 ; j <=i ; j++) {
			if(i%j == 0) {
				count++;
			}
		  }
			if(count < 2) {
				sumPrimeNumbers+=i;
			}
		count=0;
		}
		return sumPrimeNumbers;
	}
}