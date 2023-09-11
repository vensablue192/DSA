/*Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format
First and only argument is a character string A.



Output Format
Return a character string.



Example Input
Input 1:

 A = "Hello" 
Input 2:

 A = "tHiSiSaStRiNg" 


Example Output
Output 1:

 hELLO 
Output 2:

 ThIsIsAsTrInG 


Example Explanation
Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".*/
package com.venkat.strings;

public class ToggleCase {

	public static void main(String[] args) {
		String a = "Oia";
	
		System.out.println(toggleCase(a));
	}
	
	public static String toggleCase(String A) {
		StringBuffer modifiedString = new StringBuffer(A);
		
		int chars;
	
		for(int i=0;i<A.length();i++) {
			chars=modifiedString.charAt(i);
			 
		  if(chars>=65 && chars<=90){
			  chars=chars+32;
			
	           }
			else if (chars >= 97 && chars <=122){
				chars=chars-32;
			}
			modifiedString.setCharAt(i, (char)chars);
		}
		
		return modifiedString.toString();
	}

}
