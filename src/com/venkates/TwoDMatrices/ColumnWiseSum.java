/*Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument is a 2D array of integers.(2D matrix).



Output Format
Return an array containing column-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}


Example Explanation
Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
*/

package com.venkates.TwoDMatrices;

import java.util.ArrayList;

public class ColumnWiseSum {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		A.add(al1);
		
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);
		al2.add(8);
		A.add(al2);
		
		
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(9);
		al3.add(2);
		al3.add(3);
		al3.add(4);
		A.add(al3);
		
		
		
		 ArrayList<Integer> rArr=new ArrayList<Integer>(); 
		 rArr=columnSum(A);
		 for(Integer ele: rArr) {
			System.out.println("*****"+ele);
		}
		

	}
	
    public static ArrayList<Integer> columnSum(ArrayList<ArrayList<Integer>> A) {
    	ArrayList<Integer> resultArrayList=new ArrayList<Integer>();
    	int n = A.size();
    	int m=A.get(0).size();
    	for(int j=0;j < m;j++) {
    	int sum=0;
    	for(int i=0 ; i < n;i++) {
    	sum+=A.get(i).get(j);
    	}
    	resultArrayList.add(sum);
    	}
    	return resultArrayList;
    	}
    	
    	

}
