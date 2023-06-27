package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberFromArrayIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] res=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                res[i++]=m.getKey();
            }
                 }
                 return res;
    }

}
