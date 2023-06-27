package com.interview.amazon;

public class LengthOfLastWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
        int space=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                space++;
            }
            else if(Character.isLetter(s.charAt(i))){
                break;
            }
        }
        int length=0;
        for(int j=s.length()-1-space;j>=0;j--){
            if(s.charAt(j)!=' '||Character.isLetter(s.charAt(j))){
                length++;
            }
            else
                break;
        }
        return length;
    }
	
	
	
	
	
	public int lengthOfLastWord1(String s) {
        if(s==null){
            return 0;
        }
        int space=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                space++;
            }
            else if(Character.isLetter(s.charAt(i))){
                break;
            }
        }
        int length=0;
        for(int j=s.length()-1-space;j>=0;j--){
            if(s.charAt(j)!=' '||Character.isLetter(s.charAt(j))){
                length++;
            }
            else
                break;
        }
        return length;
    }
	
	
	
	
	public int lengthOfLastWord2(String s) {
        s = s.trim();  // trim the trailing spaces in the string
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
