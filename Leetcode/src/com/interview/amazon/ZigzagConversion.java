package com.interview.amazon;

import java.util.Arrays;

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("A",1));

	}


    public static String convert(String s, int numRows) {
    	
        int length=s.length();
        if(numRows==1) {
        	return s;
        }
        int segments=(int)Math.ceil(length/(2*numRows-2.0));
        int columns=(numRows-1)*segments;
        char[][] values=new char[numRows][columns];
        for(char[] row:values){
            Arrays.fill(row,' ');
        }
        int rowCount=0,columnCount=0,start=0;

        while(start<length){
            while(rowCount<numRows&&start<length){
                values[rowCount][columnCount]=s.charAt(start);
                rowCount++;
                start++;

            }
            rowCount-=2;
            columnCount++;
            while(rowCount>0&&columnCount<columns&&start<length){
                values[rowCount][columnCount]=s.charAt(start);
                columnCount++;
                rowCount--;
                start++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char[] row:values){
            for(char c:row){
                if(c!=' '){
                    sb.append(c);
                }
            }
        }

        return sb.toString();

        
    }
}