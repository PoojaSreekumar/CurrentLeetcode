package com.interview.amazon;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] elements= {{1,3},{2,6},{8,10},{15,18}};

	}

	
	 public int[][] merge(int[][] intervals) {
	       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
	       LinkedList<int[]> list=new LinkedList<>();

	        for(int i=0;i<intervals.length;i++){
	            if(list.isEmpty()||list.getLast()[1]<intervals[i][0]){
	                list.add(intervals[i]);
	            }
	            else{
	                list.getLast()[1]=Math.max(intervals[i][1],list.getLast()[1]);
	            }
	        }
	        return list.toArray(new int[list.size()][]);
	    }
}
