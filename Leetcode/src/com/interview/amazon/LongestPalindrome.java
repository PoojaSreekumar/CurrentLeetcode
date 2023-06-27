package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestPalindrome().longestPalindromes("aacabdkacaa"));
	}

	public String longestPalindromes(String s) {
        if(s==null||s.length()==1){
            return s;
        }
        else{
        	Map<Character,List<Integer>> map=new HashMap<>();
        	int length=0;
        	String sub=s.charAt(0)+"";
            for(int i=0;i<s.length();i++) {
            	if(map.containsKey(s.charAt(i))) {
            		List<Integer> prevPos=map.get(s.charAt(i));
            		if(prevPos.size()==1) {
            			boolean val=isPalindrome(s,i,prevPos.get(0));
                		if(val==true) {
                			if(length<i-prevPos.get(0)) {
                			sub=s.substring(prevPos.get(0), i+1);
                			length=i-prevPos.get(0);
                			}
                		}
            		}
            		else {
            			for(int k=0;k<prevPos.size();k++) {
            				if(length<i-prevPos.get(k)) {
            					boolean val=isPalindrome(s,i,prevPos.get(k));
                        		if(val==true) {
                        			sub=s.substring(prevPos.get(k), i+1);
                        			length=i-prevPos.get(k);
                        			
                        		}
            				}
            			}
            			
            			
            		}
            		prevPos.add(i);
            		 //map.get(s.charAt(i)).add(i);
            		
            	}
            	else {
            		List<Integer> list=new ArrayList<>();
            		list.add(i);
            		map.put(s.charAt(i), list);
            	}
            }
            
            return sub;
            
        }
    }

	public boolean isPalindrome(String s,int end,int start) {
		//int length=end-start+1;
		for(int i=start;i<end;i++) {
			if(s.charAt(i)==s.charAt(end)) {
				end--;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
}
