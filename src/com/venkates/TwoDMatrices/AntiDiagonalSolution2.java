/*Problem Description
 * 
 */
package com.venkates.TwoDMatrices;

import java.util.ArrayList;

public class AntiDiagonalSolution2{
	
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
	
	for(ArrayList<Integer> ele1:A) {
		System.out.println("...."+ele1);
		System.out.println("....");
		System.out.println("....");
		
	}
	
	ArrayList<ArrayList<Integer>> al=Solution.antiDiagonalSolution2(A);
	
	for(ArrayList<Integer> ele:al) {
		System.out.println("...."+ele);
	}
}

    public static ArrayList<ArrayList<Integer>> antiDiagonalSolution2(ArrayList<ArrayList<Integer>> A) {
        int l = A.size();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2 * l - 1; ++i) {
    	    int offset = i < l ? 0 : i - l + 1;
	        ArrayList<Integer> row = new ArrayList<Integer>();
	        int k=0;
    	    for (int j = offset; j <= i - offset; ++j) {
		        row.add(A.get(j).get(i - j));
		        k++;
    	    }
    	    for(int j = k; j< l ;j++){
    	        row.add(0);
    	    }
	        res.add(row);
        }
        return res;
    }
}
