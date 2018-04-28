package com.week2.day5.examples;

public class printTwoDiamentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix ={
				{1,2,3},
		         {4,5,6},
		         {7,8,9}
		         };
		double[][] arr=new double[4][5];
		
		printMatrix(matrix);

	}
	
public static void  printMatrix(int[][] matrix){
	for(int i=0; i<matrix.length; i++){
  	  for(int j=0; j<matrix[i].length; j++){
  		  
  	     //System.out.print(matrix[i][j] +"\t");
        }
  	  System.out.println();
    }
	
     }

}
