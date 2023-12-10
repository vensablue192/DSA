/*Problem Description
Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.



Example Input
Input 1:

A = [1, 2, 2, 1]
Input 2:

A = [1, 3, 2]


Example Output
Output 1:

 1 
Output 2:

 0 


Example Explanation
Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].*/
package com.venkates.linkedlist_1;

public class PalindromeList {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(3);
		list.next.next = new ListNode(2);
		list.next.next.next = new ListNode(1); 
		
		System.out.println(PalindromeList.lPalin(list));
	}
	
	public static int lPalin(ListNode A) {
    	int cnt=0;
    	ListNode temp = A;
    
    	while(temp !=null) {
    	cnt++;
    	temp=temp.next;
    	}
    	temp=A;
    	int mid=cnt/2;
    	for(int jump=0;jump <mid-1;jump++) {
    		temp=temp.next;
    	}
    	 ListNode temp2=temp.next; 
    	 temp.next=null;
		
		
		  ListNode prev = null; 
		  ListNode current = temp2; 
		  ListNode next = null; 
		  while (current != null) { 
		  next = current.next; 
		  current.next = prev; 
		  prev = current;
		  current = next; 
		  } 
		  temp2 = prev;
		  
		  temp=A;
		  while(temp !=null && temp2 !=null) {
			  if(temp.val != temp2.val) return 0;
			  	temp=temp.next; 
			  	temp2=temp2.next; 
		}
		 
        return 1;
}	


}

  
	  
    