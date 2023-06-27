package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,1}, k = 3;
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int pos=map.get(nums[i]);
                if(Math.abs(i-pos)<=k){
                    return true;
                }

            }
           map.put(nums[i],i);
        }
        return false;
    }

}
