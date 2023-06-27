package com.interview.amazon;

import java.time.LocalDate;
import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,0};
		LocalDate da=LocalDate.now();

	}
	
	 public int findMaxLength(int[] nums) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        int sum=0;
	        int length=0;
	        map.put(0,-1);
	        for(int i=0;i<nums.length;i++){
	            sum=sum+(nums[i]==0?-1:1);
	            if(map.containsKey(sum)){
	                length=Math.max(length,i-map.get(sum));
	            }
	            else{
	                map.put(sum,i);
	            }
	            
	        }
	        return length;
	    }

}
