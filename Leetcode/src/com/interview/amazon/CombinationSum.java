package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,6,7};
		int taget=7;
		

	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
          List<List<Integer>> list1 = new ArrayList<>();
          combine(candidates,target,list,list1,0);
          return list1;

    }

    public void combine(int[] can, int target, List<Integer> list,List<List<Integer>> listRes, int start){
        if(target==0){
            listRes.add(new ArrayList<>(list));
            return;
        }
        else if(target<0){
            return;
        }
        for(int i=start;i<can.length;i++)
        {
            list.add(can[i]);
            combine(can,target-can[i],list,listRes,i);
            list.remove(list.size()-1);
        }

    }

}
