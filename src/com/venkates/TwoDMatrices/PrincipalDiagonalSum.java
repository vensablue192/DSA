package com.venkates.TwoDMatrices;

import java.util.ArrayList;
import java.util.List;

public class PrincipalDiagonalSum {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		A.add(al1);
		
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(7);
		
		A.add(al2);
		
		
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(9);
		al3.add(2);
		al3.add(3);
		
		A.add(al3);
		
		
		
		 
		System.out.println("*****"+diagonalSum(A));
		

	}
	public static int diagonalSum(final List<ArrayList<Integer>> A) {
		
		int n = A.size();
    	int i=0;
    	int sum=0;
    	
    	while(i < n) {
    	sum+=A.get(i).get(i);
    	i++;
    	}
    	
    	
    	return sum;
	}
}
