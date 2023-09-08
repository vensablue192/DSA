/*Problem Description
You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints
1 <= n <= 1000



Input Format
First argument is a 2D matrix A of integers



Output Format
Return the 2D rotated matrix.



Example Input
Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]


Example Output
Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]


Example Explanation
Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
Explanation 2:

 After rotating the matrix by 90 degree:
 1 goes to 3, 3 goes to 9
 2 goes to 6, 6 goes to 8
 9 goes to 7, 7 goes to 1
 8 goes to 4, 4 goes to 2*/

package com.venkates.TwoDMatrices;

import java.util.ArrayList;

public class RotateNinetyDegrees {

	public static void main(String[] args) {
				ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

				ArrayList<Integer> al1 = new ArrayList<Integer>();
				al1.add(1); al1.add(2);
				A.add(al1);

				ArrayList<Integer> al2 = new ArrayList<Integer>();
				al2.add(3);  al2.add(4);
				A.add(al2);

				System.out.println("array " + A);
				
				rotNinetyDegree(A);
			
			}
			
	public static void rotNinetyDegree(ArrayList<ArrayList<Integer>> A) {
				
				ArrayList<ArrayList<Integer>> transposedArrayList = new ArrayList<ArrayList<Integer>>();
				int len=A.size();
				
				for(int i=0;i < len; i++) {
					ArrayList<Integer> transpose=new ArrayList<Integer>();
					ArrayList<Integer> revArrayList=new ArrayList<Integer>();
					
					for(ArrayList<Integer> row: A) {
						transpose.add(row.get(i));
						
					}
					 
					for(int j=transpose.size()-1; j>=0; j-- ) {
						revArrayList.add(transpose.get(j));
					}
		
					transposedArrayList.add(revArrayList);
					
				}
				
				for(ArrayList<Integer> ele: transposedArrayList) {
					System.out.println("........."+ele);
			    }

	}
	
	public static void rotNinetyDegreeSameMatixTobeused(ArrayList<ArrayList<Integer>> A) {
	
	int n = A.size();

	// Transpose the matrix

	for (int i = 0; i < n; i++) {

	for (int j = i; j < n; j++) {

	int temp = A.get(i).get(j);

	A.get(i).set(j, A.get(j).get(i));

	A.get(j).set(i, temp);

	}

	}

	// Reverse each row

	for (int i = 0; i < n; i++) {

	for (int j = 0; j < n / 2; j++) {

	int temp = A.get(i).get(j);

	A.get(i).set(j, A.get(i).get(n - j - 1));

	A.get(i).set(n - j - 1, temp);

	}

	}

	}

	
}


