/*Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints
1<=N<=100000


Input Format
First argument is a string A of size N.



Output Format
Return the resultant string.



Example Input
Input 1:
A="aeiOUz"
Input 2:
A="AbcaZeoB"*/
package com.venkat.strings;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println(strOperations("hgUe"));

	}
	
	public static String strOperations(String A) {
		
		String s=A.concat(A);
		StringBuffer resString=new StringBuffer();
		int len = s.length();
		System.out.println(len);
		int ch;
		char ch2;
		for(int i=0;i<len;i++) {
		  ch=(int)s.charAt(i);
		  ch2=s.charAt(i);
			if(ch >=97 && ch <=122 ) {
				if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u') {
					resString.append('#');
				}
				else resString.append(ch2);
			}
			
		  
		}
		
		
		return resString.toString();
    }

}
