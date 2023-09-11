package com.venkates.DSAPractice;

import java.util.ArrayList;
import java.util.List;

public class FIzzBuzzProgramme {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
	
   public static List<String> fizzBuzz(int n) {
	   List<String> fizzBuzzArray = new ArrayList<String>();
	        for(int i=1; i <= n; i++) {
	        	if(i%3 == 0 && i%5 == 0) {
	        		fizzBuzzArray.add("FizzBuzz");
	        	}
	        	else if(i%3 == 0) {
	        		fizzBuzzArray.add("Fizz");
	        	
	        	}
	        	else if(i%5 == 0) {
	        		fizzBuzzArray.add("Buzz");        	
	        	}
	        	else
	        	{
	        		fizzBuzzArray.add(String.valueOf(i));
	        	}
	        	
	        }
	       return fizzBuzzArray;
	}
}

