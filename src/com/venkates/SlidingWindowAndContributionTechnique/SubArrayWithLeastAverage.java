/*Given an array of size N, find the subarray of size K with the least average.



Problem Constraints
1<=k<=N<=1e5
-1e5<=A[i]<=1e5


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer k.


Output Format
Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A=[3, 7, 90, 20, 10, 50, 40]
B=3
Input 2:

A=[3, 7, 5, 20, -10, 0, 12]
B=2


Example Output
Output 1:
3
Output 2:

4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average 
among all subarrays of size 3.
Explanation 2:

 Subarray between [4, 5] has minimum average



*/

package com.venkates.SlidingWindowAndContributionTechnique;

import java.util.ArrayList;

public class SubArrayWithLeastAverage {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);al.add(7);al.add(90);al.add(20);al.add(10);al.add(50);al.add(40);
		System.out.println("..."+solve(al, 3));

	}
	
	public static int findMinAvgSubarray(int arr[], int n, int k) {
	 
	// Initialize  beginning index of result
    int res_index = 0;
  
    // Compute sum of first subarray of size k
    int curr_sum = 0;
    for (int i = 0; i < k; i++)
        curr_sum += arr[i];
  
    // Initialize minimum sum as current sum
    int min_sum = curr_sum;
  
    // Traverse from (k+1)'th element to n'th element
    for (int i = k; i < n; i++) {
        // Add current item and remove first item of
        // previous subarray
        curr_sum += arr[i] - arr[i - k];
  
        // Update result if needed
        if (curr_sum < min_sum) {
            min_sum = curr_sum;
            res_index = (i - k + 1);
        }
    }
    return res_index;
}
public static int solve(ArrayList<Integer> A, int B) {
    int n = A.size();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) arr[i] = A.get(i);
    return findMinAvgSubarray(arr, n, B);
}
  

}
