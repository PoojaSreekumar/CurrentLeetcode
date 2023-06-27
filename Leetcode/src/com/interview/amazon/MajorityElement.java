package com.interview.amazon;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(new MajorityElement().majorityElement(nums));

	}
	
	 public int majorityElement(int[] nums) {
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i],map.get(nums[i])+1);
	            }
	            else{
	                map.put(nums[i],1);
	            }
	        }
	        Collection<Integer> val=map.values();
	        int max=0;
	        for(int i:val){
	            if(i>max){
	                max=i;
	            }
	        }
	        final int x=max;
	        
	         Optional<Integer> value= map.entrySet()
	                .stream()
	                .filter(entry -> Objects.equals(entry.getValue(), x))
	                .map(Map.Entry::getKey)
	                .findFirst();
	         return value.get();
	    }
	 
	 
	 class Solution {
		    public int majorityElement(int[] nums) {
		        Arrays.sort(nums);
		        return nums[nums.length/2];
		    }
		}

}
