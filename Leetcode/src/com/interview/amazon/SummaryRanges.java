package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,2,4,5,7};
		
	}
	
	public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==1){
            list.add(""+nums[0]);
            return list;
        }
        String start="";
        String end="";
        for(int i=0;i<nums.length-1;i++){
            
                if((nums[i+1]-nums[i])!=1){
                    if(!start.isBlank()){
                        list.add(start+end);
                        start="";
                        
                    }
                    else{
                        list.add(""+nums[i]);
                    }
                    if((i+1)==nums.length-1){
                        list.add(""+nums[i+1]);
                    }

                    
                }
                else{
                    if(start.isBlank()){
                        start=start+nums[i]+"->";
                    }
                    //end="";
                    end=""+nums[i+1];
                    if((i+1)==nums.length-1){
                        list.add(start+end);
                    }
                }

            
        }
        return list;
    }
	
	
	
	//
	
	public List<String> summaryRanges1(int[] nums) {
        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            // Keep iterating until the next element is one more than the current element.
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }

        return ranges;
    }

}
