package com.interview.amazon;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MaximumSizeSubarraySumEqualsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numd[]= {1,-1,5,-2,3}, k = 3;
		System.out.println(new MaximumSizeSubarraySumEqualsk().maxSubArrayLen(numd, k));
		
	}
	
	@Test
	public void find()
	{
		int numd[]= {1,-1,5,-2,3}, k = 3;
		int ret=maxSubArrayLen(numd, k);
		assertEquals(ret,4);
	}
	
	public int maxSubArrayLen(int[] nums, int k) {
	      //  Arrays.sort(nums);
	      
		 Map<Integer,Integer> map=new HashMap<>();
	      int sum=0;
	      int len=0;
	      int maxLen=0;
	      for(int i=0;i<nums.length;i++){
	          sum=sum+nums[i];
	          if(sum==k){
	            len=i+1;
	          }
	          else if(map.containsKey(sum-k)){
	              len=Math.max(len, i-map.get(sum-k));
	          }
	          if(!map.containsKey(sum)){
	            map.put(sum,i);
	          }
	          
	      }

	        return len;
	    }

}
