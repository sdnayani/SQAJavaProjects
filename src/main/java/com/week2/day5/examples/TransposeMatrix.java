package com.week2.day5.examples;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		//result
		//int[][] Transpose={{1,4,7},
		                    //{2,5,8},
		System.out.println(" The original Matrix ");
		
		for(int i=0; i<matrix.length; i++){
	    	  for(int j=0; j<matrix[i].length; j++){
	    	     System.out.print(matrix[i][j] +"\t");
	          }
	    	  System.out.println();
	      }                    //{3,6,9}};
		System.out.println(" The Transpose  Matrix ");
		int[][] transposeMatrix=transposeMatrix(matrix);
	      for(int i=0; i<transposeMatrix.length; i++){
	    	  for(int j=0; j<transposeMatrix[i].length; j++){
	    	     System.out.print(transposeMatrix[i][j] +"\t");
	          }
	    	  System.out.println();
	      }
	}
	
	public static int[][] transposeMatrix(int[][] matrix){
		
     int[][] Transpose= new int[matrix.length][matrix[0].length];
		
		for(int i=0; i<matrix.length; i++){
	      for(int j=0; j<matrix[i].length; j++){
	    	  Transpose[j][i]=matrix[i][j];
			
		     }
		}
		return Transpose;
	    }
	}


