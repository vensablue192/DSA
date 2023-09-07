/*Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format
First argument is a 2D matrix of integers.



Output Format
You have to return the Transpose of this 2D matrix.



Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:

A = [[1, 2],[1, 2],[1, 2]]


Example Output
Output 1:

[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2:

[[1, 1, 1], [2, 2, 2]]


Example Explanation
Explanation 1:

Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
*/
 package com.venkates.TwoDMatrices;

import java.util.ArrayList;

public class MatrixTranspose {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1); al1.add(2);
		A.add(al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);  al2.add(6);
		A.add(al2);

		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(9); al3.add(2);
		A.add(al3);

		System.out.println("array " + A);
		
		ArrayList<ArrayList<Integer>> al= matrixTranspose(A);
		for(ArrayList<Integer> ele:al) {
			System.out.println("*****" + ele);
		}
	}
	
	public static ArrayList<ArrayList<Integer>> matrixTranspose(ArrayList<ArrayList<Integer>> A) {
		
		ArrayList<ArrayList<Integer>> transposedArrayList = new ArrayList<ArrayList<Integer>>();
		int len=A.size();
		int cols=A.get(0).size();
		System.out.println(len);
		System.out.println(cols);
		
		if(len == cols) {
		for(int i=0;i < len; i++) {
			ArrayList<Integer> tempList=new ArrayList<Integer>();
			
			for(ArrayList<Integer> row: A) {
				tempList.add(row.get(i));
			}
			transposedArrayList.add(tempList);
			
		}
	}
		else {
			for(int i=0;i < cols; i++) {
				ArrayList<Integer> tempList=new ArrayList<Integer>();
				
				for(ArrayList<Integer> row: A) {
					tempList.add(row.get(i));
				}
				transposedArrayList.add(tempList);
				
			}
			
		}
		
		return transposedArrayList;
    }
	

}
