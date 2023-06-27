package com.interview.amazon;

public class RemoveMoreThan2DuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,1,1,1,2,3,3};
		int max=new RemoveMoreThan2DuplicatesFromSortedArray().removeDuplicates(nums);
		for(int i=0;i<max;i++) {
			System.out.print(" "+nums[i]);
		}
		
	}
	

	    
	    public int removeDuplicates(int[] nums) {
	    	int index=0;
	        int count=0;
	        int length=nums.length;
	        for(int i=1;i<nums.length;i++) {
	        	if(nums[index]==nums[i]) {
	        		count++;
	        	}
	        	else {
	        		count=0;
	        	}
	        	if(count<=1) {
	        		nums[++index]=nums[i];
	        	}
	        }
	        return index+1;

	    
	    }
	   
	}


