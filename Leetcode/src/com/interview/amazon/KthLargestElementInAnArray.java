package com.interview.amazon;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findKthLargest(int[] nums, int k) {
	        
	        Arrays.sort(nums);
	        return nums[nums.length-k];
	        
	    }
	 
	 //
	 public int findKthLargest1(int[] nums, int k) {
	        /*
	        Arrays.sort(nums);
	        return nums[nums.length-k];
	        */

	        PriorityQueue<Integer> pq=new PriorityQueue<>();
	        for(int i=0;i<nums.length;i++){
	            pq.add(nums[i]);
	            if(pq.size()>k){
	                pq.remove();
	            }
	        }
	        return pq.peek();
	            }
	 
	 
	 //0(n)
	 //Given n as the length of nums and m as maxValue - minValue,

	  //  Time complexity: O(n+m)
	 public int findKthLargest2(int[] nums, int k) {
	      

	        int max=nums[0];
	        int min=nums[0];
	        for(int i=1;i<nums.length;i++){
	            max=Math.max(max,nums[i]);
	            min=Math.min(min,nums[i]);
	        }
	        int size=max-min+1;
	        int freq[]=new int[size];
	        for(int i=0;i<nums.length;i++){
	            freq[nums[i]-min]++;
	        }
	        int rem=k;
	        for(int j=size-1;j>=0;j--){
	            rem=rem-freq[j];
	            if(rem<=0){
	                return j+min;
	            }
	        }
	        return -1;
	        
	            }

}
