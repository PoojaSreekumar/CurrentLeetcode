package com.interview.amazon;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
	}
	
	 public int maxSubArray(int[] nums) {
	        int sum=nums[0];
	        int maxSum=nums[0];
	        for(int i=1;i<nums.length;i++){
	            sum=sum+nums[i];
	            if(sum<nums[i]){
	                sum=nums[i];
	            }
	            if(maxSum<sum){
	                maxSum=sum;
	            }
	        }
	        return maxSum;
	        
	    }

}
