package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IntegerToRoman().intToRoman(51));
	}
	
	public String intToRoman(int num) {
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
       
        int nums[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String values[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<nums.length&&num>0;i++) {
        	while(nums[i]<=num) {
        		str=str.append(values[i]);
        		num=num-nums[i];
        	}
        
        
        }
        return str.toString();
        
    }

}
