package com.interview.amazon;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="A man, a plan, a canal: Panama";
	}
	

	    public boolean isPalindrome(String s) {
	        StringBuilder sb=new StringBuilder();
	        s=s.toLowerCase();
	        for(int i=0;i<s.length();i++){
	            if(Character.isLetterOrDigit(s.charAt(i))){
	                sb.append(s.charAt(i));
	            
	        }
	        }
	        
	        for(int i=0,j=sb.length()-1;i<sb.length()/2;i++,j--){
	            if(sb.charAt(i)!=sb.charAt(j)){
	                return false;
	            }
	        }
	        return true;
	    }
	
	    public boolean isPalindromeUsingStreams(String s) {
	        StringBuilder builder = new StringBuilder();

	        s.chars()
	            .filter(c -> Character.isLetterOrDigit(c))
	            .mapToObj(c -> Character.toLowerCase((char) c))
	            .forEach(builder::append);

	        return builder.toString().equals(builder.reverse().toString());
	      }

}
