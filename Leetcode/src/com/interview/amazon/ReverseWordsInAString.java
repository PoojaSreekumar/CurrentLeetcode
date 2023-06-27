package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a good   example";

	}
	public String reverseWords(String s) {
        int start=0;
        int end=s.length()-1;
        while(s.charAt(start)==' '){
            start++;
        }
        while(s.charAt(end)==' '){
            end--;
        }
        List<String> list=new ArrayList<>();
        String sub="";
        for(int i=start;i<=end;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sub=sub+s.charAt(i);
                if(i==end){
                    list.add(sub);
                }
            }
            else {
                if(!sub.isBlank()){
                    list.add(sub);
                    sub="";
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            sb.append(list.get(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

	public String reverseWords1(String s) {
	    // remove leading spaces
	    s = s.trim();
	    // split by multiple spaces
	    List<String> wordList = Arrays.asList(s.split("\\s+"));
	    Collections.reverse(wordList);
	    return String.join(" ", wordList);
	  }
}
