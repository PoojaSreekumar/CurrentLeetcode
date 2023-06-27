package com.interview.amazon;

public class LongestCommonPrefixOrStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String longestCommonPrefix(String[] strs) {
        String str="";
        if(strs!=null){
            str=strs[0];
        }
        for(int i=1;i<strs.length;i++){
            if(strs[i]!=null&&!str.isBlank()&&strs[i].startsWith(String.valueOf(str.charAt(0)))){
                while(strs[i].indexOf(str)!=0){
                    str=str.substring(0,str.length()-1);
                }
            }
            else{
                str="";
                break;
            }
        }
        return str;
    }

}
