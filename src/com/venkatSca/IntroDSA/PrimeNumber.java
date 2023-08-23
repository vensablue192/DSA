package com.venkatSca.IntroDSA;

public class PrimeNumber{

	public static void main(String[] args) {
		System.out.println("1 means Prime - 0 means non prime : " +checkPrime(12));

	}
	
	public static int checkPrime(int number) {
		int isPrime=0;
		int count=0;
		int iterations = (int)Math.sqrt(number);
		for(int i=1; i <= iterations ; i++) {
			if(number%i == 0) {
				if(i != number/i) {
					count+=2; 
				}
				else {
					count++;
				}
			}
		}
		if(count == 2) {
			isPrime=1;
		}
		return isPrime;
	}

}
