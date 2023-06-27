package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public static void main(String args[]) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				
				{9,10,11,12}};
		System.out.println(new SpiralMatrix().spiralOrder(matrix));
	}
	
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int columns=matrix[0].length;
        int rows=matrix.length;
        int left=0,right=columns-1;
        int down=rows-1,up=0;
        while(list.size()<columns*rows){
            for(int j=left;j<=right;j++){
                list.add(matrix[up][j]);
                

            }
            for(int i=up+1;i<=down;i++){
                list.add(matrix[i][right]);
            }
            if(up!=down) {
            	for(int j=right-1;j>=left;j--){
                    list.add(matrix[down][j]);
                }
            }
            
            if(right!=left) {
            	for(int i=down-1;i>=up+1;i--){
                    list.add(matrix[i][left]);
                }
            }
            
            left++;
            right--;
            up++;
            down--;

        }
               
        
        return list;
        
    }

}
