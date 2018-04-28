package com.week4.day2.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesUsingNoCollections {

    

    public static void main(String args[]) {

        int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};
            int[] input1={1, 1, 2, 2, 3, 4, 5};
            int[] output=removeDuplicates(input1);
           ArrayList<Integer> arr= removeDuplicateElementsUsingHashSet(input1);
           for(int a: arr){
        	    System.out.println(" The duplicate " +a);
        	    
           }
           // System.out.println("After removing duplicates   : " + Arrays.toString(output));

       /* for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }*/
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      //{1, 2, 2, 2, 3, 4, 5}
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        //prev=1
        //1,2
        result[0] = previous;
         
        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];  //1- ist iter
            //ch=1
             //1!=2
            if (previous != ch) {
                result[i] = ch;
                //result[1]=2
            }
            previous = numbersWithDuplicates[i];
        }
        return result;

    }
    
    public static ArrayList<Integer> removeDuplicateElementsUsingHashSet(int[] input){
    	HashSet<Integer>hs= new HashSet<Integer>();
    	ArrayList<Integer>arrayList= new ArrayList<Integer>();
    	//[1,1,2,3,4]
    Boolean sucess=	false;
    	for(int a:input){
    		sucess=hs.add(a);
    		if(sucess==false){
    			arrayList.add(a);
    		   }
    		
    		
    	    }
    	int[] arr= {1,2};
    int[] b={3,2,1};
    Arrays.asList(b);
    	
    	return arrayList;
    	
    }
}


