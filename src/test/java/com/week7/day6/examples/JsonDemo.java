package com.week7.day6.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeJson("book.json");
		readJson("book.json");

	}
	
	public static void  writeJson(String file){
		
		JSONObject json=new JSONObject();
		json.put("title", "Harry Potter and Half Blood Prince");
		json.put("author", "J. K. Rolling");
		json.put("price", 20);
		JSONArray jsonArray= new JSONArray();
		jsonArray.add("Harry");
		jsonArray.add("Ron");
		jsonArray.add("Hermoinee");
		json.put("characters", jsonArray);
		
		try{
			System.out.println(" writing to file...");
			System.out.println(json);
			System.out.println("Writing the json files...");
             
			FileWriter jsonFileWriter= new FileWriter(file);
			jsonFileWriter.write(json.toJSONString());
			jsonFileWriter.flush();
			jsonFileWriter.close();
			System.out.println("close");
				
			
		}catch(IOException e){
			
		}

		
	}

	public static void readJson(String file){
		JSONParser parser= new JSONParser();
		try {
			FileReader jsonReader= new FileReader(file);
	         JSONObject json = (JSONObject) parser.parse(jsonReader);

	            String title = (String) json.get("title");
	            String author = (String) json.get("author");
	            Long price = (Long) json.get("price");
	            
	            System.out.println("title: " + title);
	            System.out.println("author: " + author);
	            System.out.println("price: " + price);
                
                
	            JSONArray characters= (JSONArray)json.get("characters");
                Iterator i= characters.iterator();
                while(i.hasNext()){
                	  System.out.println(" "+i.next());
                }
                System.out.println("characters:");
                
	            
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
