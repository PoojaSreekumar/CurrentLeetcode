package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations(digits));

	}


  
    	public List<String> letterCombinations(String digits) {
    	       Map<Character,String> map=Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
    	        
    	    
    	     List<String> list=new ArrayList<>();
    	     if(digits==null||digits.isBlank()){
    	         return list;
    	     }
    	  
    	     backTrack(list,0,new StringBuilder(),digits,map);
    	     return list;
    	}

    	public void backTrack(List<String> list,int i,StringBuilder sb,String digits,Map<Character,String> map){
    	    if(sb.length()==digits.length()){
    	        list.add(sb.toString());
    	        return;
    	    }
    	    String list1=map.get(digits.charAt(i));
    	    for (char letter: list1.toCharArray()){
    	        sb.append(letter);
    	        backTrack(list,i+1,sb,digits,map);
    	        //sb.remove(sb.length()-1);
    	        sb.deleteCharAt(sb.length()-1);

    	    }
    	}

}