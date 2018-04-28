package com.week3.day3.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Java Program to find duplicate elements in an array. There are two straight
 * forward solution of this problem first, brute force way and second by using
 * HashSet data structure. A third solution, similar to second one is by using
 * hash table data structure e.g. HashMap to store count of each element and
 * print element with count 1.
 * 
 * @author java67
 */

public class DuplicatesInArray{

    public static void main(String args[]) {

        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java","Java","Java"};
        //ArrayList<String>dups=findDuplicatesUsingBruteForce(names);
       //System.out.println(" The dups " +dups); 
       //HashSet<String>hs= findDuplicatesUsingHashSet(names);
      //System.out.println(" The dups using hashset " +hs);
      findDuplicatesUsingHashMap(names);
      
       
    }
    
    public static HashSet<String> findDuplicatesUsingBruteForce(String[] names){
    	
    	System.out.println("Finding duplicate elements in array using brute force method");
    	
    	HashSet<String>duplicates= new HashSet<String>();
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j]) ) {
                   // got the duplicate element
                	duplicates.add(names[i]);
                	System.out.println("Found Duplicate at " +names[i]);
                }
            }
        }
        return duplicates;
        
    }
    
    public static HashSet<String> findDuplicatesUsingHashSet(String[] names){
    	 // Second solution : use HashSet data structure to find duplicates
        System.out.println("Duplicate elements from array using HashSet data structure");
        HashSet<String> hs = new HashSet<String>();
        //HashSet<String> duplicates = new HashSet<String>();
        HashSet<String> duplicates1 = new HashSet<String>();
        for (String name : names) {
            if (!hs.add(name)) {
                System.out.println("found a duplicate element in array : "
                        + name);
                duplicates1.add(name);
            }
            
        }
        return duplicates1;
    }
  
    public static void findDuplicatesUsingHashMap(String[] names){
    	
    	  // Third solution : using Hash table data structure to find duplicates
        System.out.println("Duplicate elements from array using hash table");
        ArrayList<String>duplicates=new ArrayList<String>();
        HashMap<String, Integer> nameAndCount = new HashMap<String,Integer>();
         
        // build hash table with count
        for (String name : names) {
            Integer count = nameAndCount.get(name);
        	     
            if (nameAndCount.get(name) == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Iterator<Map.Entry<String, Integer>> mapIterator = nameAndCount.entrySet().iterator();
        
        /*while (mapIterator.hasNext()) {
	          Map.Entry<Integer, String> entry = while (mapIterator.hasNext()) {
		          Map.Entry<Integer, String> entry = mapIterator.next();
		          System.out.println(entry.getKey() + ": " + entry.getValue());
		      } .next();
	          System.out.println(entry.getKey() + ": " + entry.getValue());
	      } */
        /*for (Entry<String, Integer> entry : nameAndCount) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
                duplicates.add(entry.getKey());
            }
        }*/
    }
    	
    }
    



