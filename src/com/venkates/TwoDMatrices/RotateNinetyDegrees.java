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


