package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,k=2;
		

	}

	
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        combinations(list,list1,1,n,k);
        return list;
        
    }

    public void combinations(List<List<Integer>> list,List<Integer> list1,int start,int n,int k){
        if(list1.size()==k){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=start;i<=n;i++){
            list1.add(i);
            combinations(list,list1,i+1,n,k);
            list1.remove(list1.size()-1);
        }

    }
}
