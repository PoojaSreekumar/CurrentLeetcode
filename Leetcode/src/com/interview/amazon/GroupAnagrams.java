package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stubstrs =
		String str[]={"eat","tea","tan","ate","nat","bat"};
		System.out.println(new GroupAnagrams().groupAnagrams(str));

	}
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(s,list);
            }

        }
      //  map.values
        return new ArrayList<>(map.values());
    }

}
