package com.interview.amazon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void setZeroes(int[][] matrix) {
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    que.add(i);
                    que.add(j);
                }
            }
        }
        while(!que.isEmpty()){
            int left=que.poll();
            int right=que.poll();
            change(left,right,matrix);
        }

        

        
    }
    public int[][] change(int i,int j, int[][] val){
        for(int p=0;p<val[0].length;p++){
            val[i][p]=0;
        }
        for(int q=0;q<val.length;q++){
            val[q][j]=0;
        }
        return val;
            
        }
    
    
    //
    
    public void setZeroes1(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        // Essentially, we mark the rows and columns that are to be made zero
        for (int i = 0; i < R; i++) {
          for (int j = 0; j < C; j++) {
            if (matrix[i][j] == 0) {
              rows.add(i);
              cols.add(j);
            }
          }
        }

        // Iterate over the array once again and using the rows and cols sets, update the elements.
        for (int i = 0; i < R; i++) {
          for (int j = 0; j < C; j++) {
            if (rows.contains(i) || cols.contains(j)) {
              matrix[i][j] = 0;
            }
          }
        }
      }

}
