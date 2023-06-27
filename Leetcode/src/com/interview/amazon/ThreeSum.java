package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,0,-1};
		System.out.println(new ThreeSum().threeSum(n));

	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
	       
		 Arrays.sort(nums);
	        Set<List<Integer>> s=new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<=0){
	                twosum(nums,-1*nums[i],i,s);
	            }
	            
	            
	        }
	        
	        return new ArrayList<>(s);
	        
	    }

	    public void twosum(int[] nums,int target,int pos,Set<List<Integer>> s){
	        
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=pos+1;i<nums.length;i++){
	            int value=target-nums[i];
	            if(map.containsKey(value)){
	                
	                List<Integer> l=new ArrayList<>();
	                l.add(nums[i]);
	                l.add(nums[pos]);
	                l.add(value);
	                Collections.sort(l);
	                s.add(l);
	                
	                
	               // return new ArrayList<Integer>(Arrays.asList(nums[i],,value));
	            }
	            else{
	                map.put(nums[i],i);
	            }
	        }
	       
	    }
}


//

class Solution33 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        
        return res;
    }
}


//leetcode
class Solution34 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
        }
    }
}
