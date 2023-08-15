
package com.interview.amazon;

public class MaximumSubarraySumCircular {
	
	public static void main(String args[]) {
		int nums[]= {5,-3,5};
		System.out.println(new MaximumSubarraySumCircular().maxSubarraySumCircular(nums) );
	}
	
	public int maxSubarraySumCircular(int[] nums) {

	    int sum=nums[0];
	    int maxSum=nums[0];
	    int curMin=nums[0];
	    int minSum=nums[0];
	    int total=nums[0];
	    for(int i=1;i<nums.length;i++){
	        total=total+nums[i];
	        curMin=curMin+nums[i];
	        sum=sum+nums[i];
	        if(sum<nums[i]){
	            sum=nums[i];
	        }

	        if(sum>maxSum){
	            maxSum=sum;
	        }

	        if(curMin>nums[i]){
	            curMin=nums[i];
	        }
	        if(minSum>curMin){
	            minSum=curMin;
	        }
	    }

	    if(maxSum>0){
	        int diff=total-minSum;
	        return diff>maxSum?diff:maxSum;
	    }
	    return maxSum;
	        
	    }

}
