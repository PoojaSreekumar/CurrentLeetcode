package com.interview.amazon;

public class AddBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String addBinary(String a, String b) {
        if(a==null||a.length()==0)
            return b;
        if(b==null||b.length()==0)
            return a;
        int maxLen=Math.max(a.length(),b.length());
        int lenA=a.length()-1;
        int lenB=b.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<maxLen;i++){
            int c=i<(lenA+1)?a.charAt(lenA-i)-'0':0;
            int d=i<(lenB+1)?b.charAt(lenB-i)-'0':0;
            sum=(carry+c+d)%2;
            sb.append(sum);
            carry=(carry+c+d)/2;
        }
        if(carry==1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
	
	public String addBinary1(String a, String b) {
	    return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
	  }

}
