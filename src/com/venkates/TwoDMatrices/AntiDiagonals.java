/*Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0*/

package com.venkates.TwoDMatrices;

import java.util.ArrayList;

public class AntiDiagonals {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);

		A.add(al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);

		A.add(al2);

		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(9);
		al3.add(2);
		al3.add(3);

		A.add(al3);

		System.out.println("array " + A);
		ArrayList<ArrayList<Integer>> al= antiDiagonalsSol1(A);
		for(ArrayList<Integer> ele:al) {
			System.out.println("*****" + ele);
		}
		

	}

	public static ArrayList<ArrayList<Integer>> antiDiagonalsSol1(ArrayList<ArrayList<Integer>> A) {

		int n = A.size();

		ArrayList<ArrayList<Integer>> resultArray = new ArrayList<ArrayList<Integer>>();

		
		for (int j = 0; j < n; j++) {
			ArrayList<Integer> rowElem = new ArrayList<Integer>();
			int row = 0;
			int col = j;
			int cnt=0;
			while (row < n && col >= 0 ) {
				rowElem.add(A.get(row).get(col));
				row++;
				col--;
				cnt++;
			}
			for(int k=cnt;k<n;k++) {
				rowElem.add(0);
			}
			resultArray.add(rowElem);
		}
				
		for (int i = 1; i < n; i++) {
			ArrayList<Integer> rowElem = new ArrayList<Integer>();
			int row = i;
			int col = n - 1;
			int cnt=0;
			while (row < n && col >= 0) {
				rowElem.add(A.get(row).get(col));
				row++;
				col--;
				cnt++;
			}
			for(int k=cnt;k<n;k++) {
				rowElem.add(0);
			}
			resultArray.add(rowElem);
		
		}
		

		 return resultArray;
	}
}
