/*Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".*/
package com.venkat.strings;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		System.out.println(longestPalindromeSubString("aaabaaa"));

	}
	
	public static String longestPalindromeSubString(String A){
		
	        int n = A.length(); // calculating size of string
	        if (n ==0)
	            return "";
	        else if(n==1)
	        	return A;
	 
	        int maxLength = 1,start=0;
	        int low, high;
	        for (int i = 0; i < n; i++) {
	            low = i - 1;
	            high = i + 1;
	            while ( high < n && A.charAt(high) == A.charAt(i)) //increment 'high'                                  
	                high++;
	       
	            while ( low >= 0 && A.charAt(low) == A.charAt(i)) // decrement 'low'                   
	                low--;
	       
	            while (low >= 0 && high < n && A.charAt(low) == A.charAt(high) ){
	                  low--;
	                high++;
	        }
	 
	        int length = high - low - 1;
	        if (maxLength < length){
	            maxLength = length;
	            start=low+1;
	        }
	    }   
	    
		return A.substring(start, start + maxLength );
	}

}
