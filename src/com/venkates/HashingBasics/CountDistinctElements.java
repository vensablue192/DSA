package com.venkates.HashingBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctElements {

		public static void main(String[] args) {
			 
			List<Integer> A=new ArrayList<Integer>();
			A.add(10); A.add(5); A.add(3); A.add(4); A.add(3); A.add(5); A.add(4); 
				
			/*
			 * List<Integer> A=new ArrayList<Integer>(); A.add(6); A.add(10); A.add(5);
			 * A.add(4); A.add(9); A.add(120);
			 */
			System.out.println(countDistinctElements(A));
		}
		
		
		  public static int countDistinctElements(List<Integer> A) {
			 
			  int length=A.size();
		    	
		    	Map<Integer, Integer> m3=new HashMap<Integer, Integer>();  
		    	
		    	for(int i=0;i<length;i++) {
		    	if(!m3.containsKey(A.get(i))== true) {
					 m3.put(A.get(i), 1);
				 }
				 else {
					 m3.computeIfPresent(A.get(i), (k,v) -> v+1);
				 }	
		    	}
			  
			return m3.entrySet().size();
			  
			  
		  }

	}

// Different implementation
	/*-public class Solution {
	    public int solve(int[] A) {
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0 ; i < A.length ; i++){
	            set.add(A[i]);
	        }
	        return set.size();
	    }
	}
	*/