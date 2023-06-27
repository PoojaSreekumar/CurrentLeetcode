package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba", s = "dog dog dog dog";
		System.out.println(wordPattern(pattern,s));

	}
	
	public static boolean wordPattern(String pattern, String s) {
        String[] sub=s.split("\\s+");
      
      Map<String,Character> map=new HashMap<>();
      Map<Character,String> map1=new HashMap<>();
      if(pattern.length()!=sub.length) {
      	return false;
      }
      for(int i=0;i<pattern.length();i++){
          char pat=pattern.charAt(i);
          String word=sub[i];
          if(!map1.containsKey(pat)){
              if(map.containsKey(word)){
                  return false;
              }
              else{
                  map.put(word,pat);
                  map1.put(pat,word);
              }
           }
           else{
               if(!map1.get(pat).equals(word)){
                   return false;
               }

           }
  
}
return true;
}
	
	//
	
	class Solution36 {
	    public boolean wordPattern(String pattern, String s) {
	        HashMap map_index = new HashMap();
	        String[] words = s.split(" ");

	        if (words.length != pattern.length())
	            return false;

	        for (Integer i = 0; i < words.length; i++) {
	            char c = pattern.charAt(i);
	            String w = words[i];

	            if (!map_index.containsKey(c))
	                map_index.put(c, i);

	            if (!map_index.containsKey(w))
	                map_index.put(w, i);

	            if (map_index.get(c) != map_index.get(w))
	                return false;
	        }

	        return true;
	    }
	}
}
