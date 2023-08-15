package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfKSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint[
		int[] nums= {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
		int k=3;
		System.out.println(new MaximumNumberOfKSumPairs().maxOperations(nums, k));

	}
	
	 public int maxOperations(int[] nums, int k) {
	        int count=0;
	        Map<Integer,Integer> map1=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);

	        }
	        for(int j=0;j<nums.length;j++){
	            int val=nums[j];
	            int remain=k-val;
	            if(map1.containsKey(remain)){
	                
	                int freq=map1.get(remain);
	                if(remain==val){
	                    if(freq>1){
	                        map1.put(val,freq-2);
	                        count++;
	                    }
	                }
	                else{
	                    if(freq>0&&map1.get(val)>0){
	                        map1.put(remain,--freq);
	                        map1.put(val,map1.get(val)-1);
	                        count++;
	                    }
	                }
	            }
	        }
	        return count;
	    }

}

//0(n)

