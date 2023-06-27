package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestSubstringWithoutRepetition().lengthOfLongestSubstring("abcabcbb"));
	}
	
	public int lengthOfLongestSubstring(String s) {
        int length=0;
        Map<Character,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++) {
        	char value=s.charAt(i);
        	if(map.containsKey(value)) {
        		
        		if(map.get(value)>=j) {
        			int current=i-j;
            		if(length<current) {
            			length=current;
            		}
        		j=map.get(value)+1;
        		map.put(value, i);
        		continue;
        		
        		}
        	}
        		int current=i-j+1;
        		if(length<current) {
        			length=current;
        		}
        		map.put(value, i);
        	}
        
        return length;
    }

	public int lengthOfLongestSubstring1(String s) {
        Integer[] chars = new Integer[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            Integer index = chars[r];
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }

            res = Math.max(res, right - left + 1);

            chars[r] = right;
            right++;
        }

        return res;
    }
}
