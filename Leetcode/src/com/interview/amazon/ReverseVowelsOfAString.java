package com.interview.amazon;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		

	}
	
	 public String reverseVowels(String s) {
	        int start=0;
	        int end=s.length()-1;
	        Set<Character> set=new HashSet<>();
	        set.add('a');
	        set.add('e');
	        set.add('i');
	        set.add('o');
	        set.add('u');
	        set.add('A');
	        set.add('E');
	        set.add('I');
	        set.add('O');
	        set.add('U');
	        char[] ch=s.toCharArray();
	        while(start<end){
	            if(!set.contains(ch[start])){
	                start++;
	            }
	             if(!set.contains(ch[end])){
	                end--;
	            }
	            if(set.contains(ch[start])&&set.contains(ch[end])){
	                char temp=ch[start];
	                ch[start++]=ch[end];
	                ch[end--]=temp;
	                
	            }


	        }
	        return String.valueOf(ch);
	    }
	 
	 
	 
	 
	 
	 
	 //
	 
		    // Return true if the character is a vowel (case-insensitive)
		    boolean isVowel(char c) {
		        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
		            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
		    }
		    
		    // Function to swap characters at index x and y
		    void swap(char[] chars, int x, int y) {
		        char temp = chars[x];
		        chars[x] = chars[y];
		        chars[y] = temp;
		    }
		    
		    public String reverseVowels1(String s) {
		        int start = 0;
		        int end = s.length() - 1;
		        // Convert String to char array as String is immutable in Java
		        char[] sChar = s.toCharArray();
		        
		        // While we still have characters to traverse
		        while (start < end) {
		            // Find the leftmost vowel
		            while (start < s.length () && !isVowel(sChar[start])) {
		                start++;
		            }
		            // Find the rightmost vowel
		            while (end >= 0 && !isVowel(sChar[end])) {
		                end--;
		            }
		            // Swap them if start is left of end
		            if (start < end) {
		                swap(sChar, start++, end--);
		            }
		        }
		        
		        // Converting char array back to String
		        return new String(sChar);
		    }
		

}
