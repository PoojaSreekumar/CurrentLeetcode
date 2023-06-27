package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        if(s==null||t==null||s.length()!=t.length()){
            return false;
        }
        char[] first=s.toCharArray();
        char[] sec=t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(first[i])){
                map.put(first[i],map.get(first[i])+1);
            }
            else{
                map.put(first[i],1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(map.containsKey(sec[j])){
                int val=map.get(sec[j]);
                if(val==0){
                    return false;
                }
                map.put(sec[j],val-1);
                continue;
            }
            return false;
        }
        return true;
    }
	
	public boolean isAnagram1(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] counter = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
	    }
	    for (int count : counter) {
	        if (count != 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
