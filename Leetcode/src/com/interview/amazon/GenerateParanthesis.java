package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> list=new ArrayList<>();
		new GenerateParanthesis().valid(list,"",n,0,0);
		System.out.println(list);

	}

	private void valid(List<String> list, String s, int num,int open,int close) {
		// TODO Auto-generated method stub
		if(open==num&&close==num) {
			list.add(s);
			return;
		}
		if(open<num) {
			valid(list,s+"(",num,open+1,close);
		}
		if(close<open) {
			valid(list,s+")",num,open,close+1);
		}
	}

}
