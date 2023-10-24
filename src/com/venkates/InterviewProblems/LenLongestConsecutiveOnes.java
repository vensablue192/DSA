/*Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7*/
package com.venkates.InterviewProblems;

public class LenLongestConsecutiveOnes {

	public static void main(String[] args) {
		System.out.println(lenLongestConsecutiveOnes("111000"));

	}
	
	public static int lenLongestConsecutiveOnes(String A) {
		int answer=0;
		
		int totalOnes=0;
		int totalzeroes=0;
		int length=A.length();
		
		for(int i=0;i<length;i++) {
			if(A.charAt(i) == '1') {
				totalOnes++;
			}
			else {
				totalzeroes++;
			}
		}
		
		if(totalOnes == length) return length;
		
		
		
		for(int i=0;i<length;i++) {
			int currentAnswer=0;
			if(A.charAt(i) == '0') {
				int l=0,r=0;
				int j=i+1;
				while(j<length && A.charAt(j)== '1') {
					r++;
					j++;
				}
				j=i-1;
				while(j>=0 && A.charAt(j)== '1') {
					l++;
					j--;
				}
				
				currentAnswer=l+r+1;
				if(l+r == totalOnes) {
					currentAnswer = l+r;
				}
				
				if(currentAnswer >  answer) {
					answer=currentAnswer;
				}
			}	
	}
	return answer;
 }
}
