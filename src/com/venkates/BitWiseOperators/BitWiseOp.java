package com.venkates.BitWiseOperators;

public class BitWiseOp {

	public static void main(String[] args) {
		int a = 15; // 0000 1111
		int b = 27; // 0001 1011
		
		int bAnd = a & b;
		int bOr = a | b;
		int xOR = a ^ b;
		int oneSComplement = ~a;
		
		System.out.println("And Operation " + bAnd);
		System.out.println("And Operation " + bOr);
		System.out.println("And Operation " + xOR);
		System.out.println("And Operation " + oneSComplement);
		
	}

}
