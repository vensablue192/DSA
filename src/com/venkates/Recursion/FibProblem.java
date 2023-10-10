package com.venkates.Recursion;

public class FibProblem {

	public static void main(String[] args) {
	
		System.out.println(foo(3,5));

	}

	private static int foo(int x, int y) {
		
		if(y==0) return 1;
		return bar(x,foo(x, y-1));
		
	}

	private static int bar(int x, int y) {
		if(y==0) return 0;
		return (x + bar(x, y-1));
	}

}
// Explanation of the logic
/*
 * Foo will do 2 actions wrt Y value 
 * 	1. Return 1 if Y=0 
 *  2. bar(x,foo(x,y))
 * 
 * Bar will do 2 actions wrt Y value 
 * 1. Return 0 if Y=0 
 * 2. return x+bar(x,y) if Y!=0
 * 
 * The Main function calls-
 * foo(3,5) => 
 * 		bar(3,foo(3,4))  // E 
 * 			bar(3,foo(3,3)) // D 
 *             bar(3,foo(3,2)) // C 
 *                   bar(3,foo(3,1)) // this is B 
 *                   		bar(3,foo(3,0)) // consider this is A 
 *                   			bar(3,1)
 * 
 * If we find the result of bar(3,1), then it is the result of A.
 * 
 * Lets do that, bar(3,1) =>3+bar(3,0)
 * 						  =>3+0 A =>3 
 * 
 * Lets find the result of B (applies A in that), 
 * 			bar(3,3)
 * 			=>3+bar(3,2)
 * 				 => 3+bar(3,1) // we found that bar(3,1) is the result of A, here the result becomes 3+3 =6 which is the result of bar(3,2), it becomes 3+6 =9 
 * 					which is the result of bar(3,3) B=>9
 * 
 * Lets find the result of C, (applies B in it), 
 * 		bar(3,9) =>3+bar(3,8)
 * 				   =>3+bar(3,7) 
 * 					 =>3+bar(3,6) 
 * 						=>3+bar(3,5) 
 * 							=>3+bar(3,4) 
 * 								=> 3+bar(3,3) // we can stop here since we found the value of bar(3,3) which is the result of B. lets found the other values based on this.
 * 
 * 		bar(3,3)=9 
 * 		bar(3,4)=12 
 * 		bar(3,5)=15 
 * 		bar(3,6)=18 
 * 		bar(3,7)=21 
 * 		bar(3,8)=24
 * 		bar(3,9)=27 which is the result of C
 * 
 * Lets get the logic here from the below there values we found in detail,
 *  A=3
 * B=9
 *  C=27
 * 
 * the D and E must be, 
 * D=81 
 * E =243 which is the answer/result of bar(3,foo(3,4)) = foo(3,5)
 */
