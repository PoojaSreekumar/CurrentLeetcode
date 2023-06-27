package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		int target = 9;
		int result[]=new TwoSum().twoSum(nums, target);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map=new HashMap<>();
    	if(nums!=null) {
    		for(int j=0;j<nums.length;j++) {
    			int res=target-nums[j];
    			if(map.containsKey(res)) {
    				return new int[] {j,map.get(res)};
    			}
    			else {
    				map.put(nums[j], j);
    			}
    			
    		}
    	}
    	return null;
        
    }

}
