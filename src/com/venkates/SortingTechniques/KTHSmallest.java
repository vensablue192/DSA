package com.venkates.SortingTechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KTHSmallest {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(5);
		li.add(12);
		li.add(8);
		li.add(-5);
		li.add(4);
		
		System.out.println(kthsmallest(li,4));
	}
	
	  public static int kthsmallest(final List<Integer> A, int B) {
	  List<Integer> A2=new ArrayList<Integer>(A);
	  for(int i=0;i<B;i++) {
		  int minIdx = i;
		  for(int j=i+1;j<A.size();j++) {
			  if (A2. get(j) < A2. get(minIdx))
				  minIdx=j;
	            }
		  
	  	if (i != minIdx) {

		  int temp = A2. get(i);

		  A2.set(i, A2. get(minIdx));

		  A2.set(minIdx, temp);

		  }

		  }

		  return A2.get(B - 1);
	  
	 }
}
