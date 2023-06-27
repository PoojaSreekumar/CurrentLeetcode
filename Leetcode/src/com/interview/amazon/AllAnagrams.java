package com.interview.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		System.out.println(new AllAnagrams().findAnagrams(s, p));

	}

	public List<Integer> findAnagrams(String s, String p) {
        char[] cp=p.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:cp){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        List<Integer> pos=new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j++;
                if(map2.containsKey(s.charAt(i))){
                    map2.put(s.charAt(i),map2.get(s.charAt(i))+1);
                }
                else{
                    map2.put(s.charAt(i),1);
                }
                if(j==p.length()){
                    if(map2.equals(map)){
                        pos.add(i-j+1);
                    }
                        map2=new HashMap<Character,Integer>();
                        i=i-j+1;
                        j=0;
                        continue;
                    
                    
                }


            }
            else{
               // i=i-j
                j=0;
                map2=new HashMap<Character,Integer>();
                
            }
           
        
}
return pos;
        
    }
	
	//leetcode
	public List<Integer> findAnagrams1(String s, String p) {
	    int ns = s.length(), np = p.length();
	    if (ns < np) return new ArrayList();

	    Map<Character, Integer> pCount = new HashMap();
	    Map<Character, Integer> sCount = new HashMap();
	    // build reference hashmap using string p
	    for (char ch : p.toCharArray()) {
	      if (pCount.containsKey(ch)) {
	        pCount.put(ch, pCount.get(ch) + 1);
	      }
	      else {
	        pCount.put(ch, 1);
	      }
	    }

	    List<Integer> output = new ArrayList();
	    // sliding window on the string s
	    for (int i = 0; i < ns; ++i) {
	      // add one more letter 
	      // on the right side of the window
	      char ch = s.charAt(i);
	      if (sCount.containsKey(ch)) {
	        sCount.put(ch, sCount.get(ch) + 1);
	      }
	      else {
	        sCount.put(ch, 1);
	      }
	      // remove one letter 
	      // from the left side of the window
	      if (i >= np) {
	        ch = s.charAt(i - np);
	        if (sCount.get(ch) == 1) {
	          sCount.remove(ch);
	        }
	        else {
	          sCount.put(ch, sCount.get(ch) - 1);
	        }
	      }
	      // compare hashmap in the sliding window
	      // with the reference hashmap
	      if (pCount.equals(sCount)) {
	        output.add(i - np + 1);
	      }
	    }
	    return output;
	  }
}
