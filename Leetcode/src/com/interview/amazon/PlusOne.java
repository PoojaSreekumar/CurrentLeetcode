package com.interview.amazon;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {9};
		int results[]=new PlusOne().plusOne(num);
		for(int i:results) {
			System.out.println(i);
		}

	}

	public int[] plusOne(int[] digits) {
        int last=digits.length-1;
        int count=0;
        if(digits[last]!=9){
            digits[last]++;
        }
        else{
        
            for(int i=last;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                    count++;
                }
                else{
                    digits[i]++;
                    break;
                }
        }
        if(count>last){
            digits=new int[last+2];
            Arrays.fill(digits, 0);
            digits[0]=1;
        }
        }
        return digits;
    }
}
