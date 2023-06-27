package com.interview.amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumberFromArrayII {

	/*
	 * Given an integer array nums where every element appears three times except for one, 
	 * which appears exactly once. Find the single element and return it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	    }
	
	 public int singleNumber(int[] nums) {
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            int number=nums[i];
	            if(map.containsKey(number)){
	                map.put(number,map.get(number)+1);
	            }
	            else{
	                map.put(number,1);
	            }
	            //hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
	        }
	        for(Map.Entry<Integer,Integer> val:map.entrySet()){
	            if(val.getValue()==1){
	                return val.getKey();
	            }
	        }
	        return 0;
	    }
	

/*
 * 3×(a+b+c)−(a+a+a+b+b+b+c)=2c
 */

public int singleNumber1(int[] nums) {
    Set<Long> set = new HashSet<>();
    long sumSet = 0, sumArray = 0;
    for(int n : nums) {
      sumArray += n;
      set.add((long)n);
    }
    for(Long s : set) sumSet += s;
    return (int)((3 * sumSet - sumArray) / 2);
  }

}