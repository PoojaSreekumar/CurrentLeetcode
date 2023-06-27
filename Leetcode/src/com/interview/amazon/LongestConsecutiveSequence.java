package com.interview.amazon;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {100,4,200,1,3,2};

	}

	
	public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longcons=0;
        for(int a:set){
            if(!set.contains(a-1)){
                int cur=a;
                int curCons=1;
                while(set.contains(cur+1)){
                    cur++;
                    curCons++;
                }
                longcons=Math.max(curCons,longcons);
            }
        }
        return longcons;
    }
}
