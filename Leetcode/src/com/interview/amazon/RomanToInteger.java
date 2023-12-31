package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RomanToInteger().romanToInt("IX"));

	}
	
	 public int romanToInt(String s) {
		 /*
			 * Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
			 */
		 Map<Character,Integer> map=new HashMap<>();
		 map.put('I', 1);
		 map.put('V', 5);
		 map.put('X', 10);
		 map.put('L', 50);
		 map.put('C', 100);
		 map.put('D', 500);
		 map.put('M', 1000);
		 int value=0;
		 
		 for(int i=0;i<s.length();i++) {
			 if(map.containsKey(s.charAt(i))) {
				 int first=map.get(s.charAt(i));
				 int second=0;
				 if((i+1)<s.length()) {
					 if(map.containsKey(s.charAt(i+1))) {
						 second=map.get(s.charAt(i+1));
					 }
					 
				 }
				 if(first<second) {
					 value=value+second-first;
					 i++;
				 }
				 else {
					 value=value+first;
				 }
			 }
		 }
		 return value;
	        
	    }

}
