package com.interview.amazon;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={
				{5,1,9,11},
				{2,4,8,10},
				{13,3,6,7},
				{15,14,12,16}};
		new RotateMatrix().rotate(matrix);
		

	}
public void rotate(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){
            swap(matrix,i,j);
        }
    }

    for(int j=0,k=col-1;j<row/2;j++,k--){
        for(int i=0;i<row;i++){
       //     swap(matrix[i][j],matrix[i][k]);
        	swapLeftRight(matrix,i,j,k);
        }
    }
    
}

public void swap(int[][] matrix,int a, int b){
   int temp=matrix[a][b];
   matrix[a][b]=matrix[b][a];
   matrix[b][a]=temp;

}

public void swapLeftRight(int[][] matrix,int i,int j,int k) {
	int temp=matrix[i][j];
	   matrix[i][j]=matrix[i][k];
	   matrix[i][k]=temp;

}


//
public void rotate1(int[][] matrix) {
int n = matrix.length;
for (int i = 0; i < (n + 1) / 2; i ++) {
    for (int j = 0; j < n / 2; j++) {
        int temp = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
        matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
        matrix[j][n - 1 - i] = matrix[i][j];
        matrix[i][j] = temp;
    }
}
}
	
	
}
