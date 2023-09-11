/*Special Subsequences "AG"
Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string 
Explanation 2:

 There is no subsequence "AG" in the given string.
*/

package com.venkatsca.carryForwardSubArray;

public class SpecialSubSequences {

	public static void main(String[] args) {
		String s= "ACCBAGkAGG";
		System.out.println(s.length());
		System.out.println("countAG .. " + countAG(s));
		
	}
	
	private static int countAG(String s) {
		int answer=0;
		int countA=0;
		int MOD = 1000*1000*1000 + 7;
		
		int len=s.length();
		
		for(int i=0; i < len; i++) {
			if(s.charAt(i) == 'A') {
				countA++;
				
			}
			else if(s.charAt(i) == 'G') {
				answer +=countA;
				answer = answer % MOD;	
			}
			
		}
			
		
		return answer;
	}

}
