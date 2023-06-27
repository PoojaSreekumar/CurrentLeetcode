package com.interview.amazon;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,1,2,4,3};
		int target=7;
		System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(target, nums));

	}
	
	 public int minSubArrayLen(int target, int[] nums) {
	        
	        int count=Integer.MAX_VALUE;
	        int sum=0;
	       int left=0;
	       for(int i=0;i<nums.length;i++){
	           sum=sum+nums[i];
	           while(sum>=target){
	               count=Math.min(count,i-left+1);
	               sum=sum-nums[left];
	               left++;
	           }
	       }
	        return count==Integer.MAX_VALUE?0:count;
	    }

}
