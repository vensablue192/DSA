/*Problem Description
You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.

NOTE: You have to do it in-place and in one-pass.



Problem Constraints
1 <= Length of linked list <= 105

Value of each node is within the range of a 32-bit integer.



Input Format
First and only argument is a linked-list node A.



Output Format
Return a linked-list node denoting the head of the reversed linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
Input 2:

 A = 3 -> NULL 


Example Output
Output 1:

 5 -> 4 -> 3 -> 2 -> 1 -> NULL 
Output 2:

 3 -> NULL 


Example Explanation
Explanation 1:

 The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL 
Expalantion 2:

 The linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL 
*/
package com.venkates.linkedlist_1;

import java.util.LinkedList;

import com.venkates.InterviewQuestions.ReverseTillNthElement;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		ListNode list = new ListNode(85);
		list.next = new ListNode(15);
		list.next.next = new ListNode(14);
		list.next.next.next = new ListNode(20); 
		RevLinkedList rl=new RevLinkedList();
		ListNode rl1= rl.reverseList(list);
		rl.printList(rl1);
		 
	}  

}


 
class RevLinkedList {
    public ListNode reverseList(ListNode A) {
    	ListNode prev = null;
    	ListNode current = A;
    	ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        A = prev;
        return A;
    		
    }
    
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}