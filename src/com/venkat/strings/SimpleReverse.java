/*Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.

Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the reversed string.

Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"

Example Output
Output 1:
 "relacs"
Output 2:
 "ymedaca"

*/
package com.venkat.strings;

public class SimpleReverse {

	public static void main(String[] args) {
		System.out.println(".."+simpleReverse("scaler"));

	}
	
	public static String simpleReverse(String A) {
		StringBuffer str=new StringBuffer(A);
		StringBuffer reversedString = new StringBuffer();
		for(int i=A.length()-1;i>=0;i--) {
			reversedString.append(str.charAt(i));
		}
		
		
		return reversedString.toString();
	}

}
