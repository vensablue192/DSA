package com.venkates.IntroDSA;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("0 - Not a Perfect number : 1 - Perfect number : " +isPerfect(28));
		
	}

	public static int isPerfect(int number) {
		int is_perfect = 0;
		int sum = 1;
		//int iterations = (int)Math.sqrt(number);
		for(int i=2 ; i*i <= number; i++) {
			if(number%i==0) {
					sum +=i;
					if(i !=number/i) {
						System.out.println(i);
						sum+=number/i;
					}
					System.out.println("..."+sum);
			}
		}
		if(sum == number) {
			is_perfect=1;
		}
		
		return is_perfect;
	}
}
