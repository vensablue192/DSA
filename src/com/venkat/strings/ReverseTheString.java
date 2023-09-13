/*
Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output
Output 1:
"blue is sky the"
Output 2:
"ib is this"    
*/
package com.venkat.strings;

import java.util.regex.Pattern;

public class ReverseTheString {

	public static void main(String[] args) {
		
		System.out.println(reveTheStr("the sky is blue"));
	
	}
	
	public static String reveTheStr(String A) {
		
        String s[] = A.split(" ");
        String res = "";
        System.out.println(s.length);
        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }

        return res.substring(0, res.length() - 1).trim();
		
		
			
    }

}
